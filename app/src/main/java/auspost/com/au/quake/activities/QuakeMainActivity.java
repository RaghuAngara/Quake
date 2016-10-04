package auspost.com.au.quake.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;

import auspost.com.au.quake.AppClass;
import auspost.com.au.quake.R;
import auspost.com.au.quake.dataadapters.EarthQuakeAdapter;
import auspost.com.au.quake.datamodels.EarthQuake;
import auspost.com.au.quake.datamodels.EarthQuakeData;

public class QuakeMainActivity extends AppCompatActivity {

    private final static String url = "http://www.seismi.org/api/eqs/";
    private ArrayList<EarthQuakeData> arrayEarthQuakeData = new ArrayList<EarthQuakeData>();

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quake_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new EarthQuakeAdapter(arrayEarthQuakeData);
        mRecyclerView.setAdapter(mAdapter);

        fetchEarthQuakeDetails();
    }

    private void fetchEarthQuakeDetails(){

        final AppClass quakeAndroidApp = (AppClass) getApplicationContext();

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("JSON Response: ", response.toString());

                        Gson gson = new GsonBuilder().serializeNulls().create();
                        /** Convert JSONResponse to POJO Classes using GSON */
                        EarthQuake DataTemp = gson.fromJson(response.toString(), EarthQuake.class);

                        /** Copy all POJO arrays into ArrayList */
                        Collections.addAll(arrayEarthQuakeData, DataTemp.earthquakes);

                        mAdapter.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        if (error != null && error.getMessage() != null) {
                            Log.i("Raghu", error.getMessage());
                        }
                    }
                });

        quakeAndroidApp.getmVolleyRequestQueue().add(jsObjRequest);
    }
}

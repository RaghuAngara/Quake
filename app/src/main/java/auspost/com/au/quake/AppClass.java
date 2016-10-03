package auspost.com.au.quake;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;

import auspost.com.au.quake.volleyhelper.VolleySingleton;

/**
 * Created by raghunandanangara on 3/10/2016.
 */

public class AppClass extends Application {

    private RequestQueue mVolleyRequestQueue;
    private ImageLoader mVolleyImageLoader;

    public RequestQueue getmVolleyRequestQueue() {
        return mVolleyRequestQueue;
    }

    public ImageLoader getmVolleyImageLoader() {
        return mVolleyImageLoader;
    }

    public void setmVolleyImageLoader(ImageLoader mVolleyImageLoader) {
        this.mVolleyImageLoader = mVolleyImageLoader;
    }

    public void setmVolleyRequestQueue(RequestQueue mVolleyRequestQueue) {
        this.mVolleyRequestQueue = mVolleyRequestQueue;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        if(getmVolleyRequestQueue()==null)
        {
            mVolleyRequestQueue = VolleySingleton.getInstance(getApplicationContext()).getRequestQueue();
            setmVolleyRequestQueue(mVolleyRequestQueue);
        }

        if(getmVolleyImageLoader()==null)
        {
            mVolleyImageLoader = VolleySingleton.getInstance(getApplicationContext()).getImageLoader();
            setmVolleyImageLoader(mVolleyImageLoader);
        }
    }
}

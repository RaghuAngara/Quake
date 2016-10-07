package auspost.com.au.quake.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import auspost.com.au.quake.R;

public class QuakeMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private String lat;
    private String log;
    private String region;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quake_maps);

        Intent getValuesfromIntent = getIntent();
        lat = getValuesfromIntent.getStringExtra("latitude");
        log = getValuesfromIntent.getStringExtra("longitude");
        region = getValuesfromIntent.getStringExtra("region");

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        GoogleMap mMap = googleMap;

        LatLng hydLatLog = new LatLng(Double.valueOf(lat), Double.valueOf(log));
        mMap.addMarker(new MarkerOptions().position(hydLatLog).title(region)).showInfoWindow();
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(hydLatLog, 5));

    }
}

package com.example.aplikasilbsku;


import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements LocationListener, OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);




    }





    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng posisiku = new LatLng(-6.99696490347236, 110.44319208476654);
        mMap.addMarker(new MarkerOptions()
                .position(posisiku)
                .title("Posisi Saya Sekarang"));
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(
                posisiku, 10f);
        mMap.animateCamera(cameraUpdate);


    }

    @Override
    public void onLocationChanged(@NonNull Location location) {
        LatLng posisiku = new LatLng(location.getLatitude(), location.getLongitude());
        mMap.addMarker(new MarkerOptions()
                .position(posisiku)
                .title("Posisi Saya Sekarang"));
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(
                posisiku, 10f);
        mMap.animateCamera(cameraUpdate);
    }


//    @Override
//    public void onLocationChanged(@NonNull Location location) {
//        LatLng posisiku = new LatLng(location.getLatitude(), location.getLongitude());
//        mMap.addMarker(new MarkerOptions()
//                .position(posisiku)
//                .title("Posisi Saya Sekarang"));
//        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(
//                posisiku, 10f);
//        mMap.animateCamera(cameraUpdate);
//    }
}


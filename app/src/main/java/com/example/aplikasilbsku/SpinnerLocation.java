package com.example.aplikasilbsku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SpinnerLocation extends AppCompatActivity implements OnMapReadyCallback, AdapterView.OnItemSelectedListener {

    private GoogleMap mMap;
    private String nama_pulau []= {"Sumatera","Jawa","Kalimantan","Sulawesi","Bali","Nusa Tenggara","Maluku","Papua"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_location);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapSpinner);
        mapFragment.getMapAsync(this);

        spinner= findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, nama_pulau);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }





    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            case 0:

                LatLng sumatera = new LatLng(-0.8, 100.5);
                mMap.addMarker(new MarkerOptions().position(sumatera).title("Marker in Sumatera"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sumatera));
                break;
            case 1:

                LatLng jawa = new LatLng(-7.5, 112.5);
                mMap.addMarker(new MarkerOptions().position(jawa).title("Marker in Jawa"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(jawa));
                break;
            case 2:

                LatLng kalimantan = new LatLng(-0.5, 113.5);
                mMap.addMarker(new MarkerOptions().position(kalimantan).title("Marker in Kalimantan"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(kalimantan));
                break;
            case 3:

                LatLng sulawesi = new LatLng(-0.5, 120.5);
                mMap.addMarker(new MarkerOptions().position(sulawesi).title("Marker in Sulawesi"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sulawesi));
                break;
            case 4:

                LatLng bali = new LatLng(-8.5, 115.5);
                mMap.addMarker(new MarkerOptions().position(bali).title("Marker in Bali"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bali));
                break;

            case 5:

                LatLng nusa_tenggara = new LatLng(-8.5, 122.5);
                mMap.addMarker(new MarkerOptions().position(nusa_tenggara).title("Marker in Nusa Tenggara"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(nusa_tenggara));
                break;
            case 6:

                LatLng maluku = new LatLng(-8.5, 130.5);
                mMap.addMarker(new MarkerOptions().position(maluku).title("Marker in Maluku"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(maluku));
                break;
            case 7:

                LatLng papua = new LatLng(-8.5, 140.5);
                mMap.addMarker(new MarkerOptions().position(papua).title("Marker in Papua"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(papua));
                break;



        }


    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {


    }
}

package com.dam.examen_final_dam;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ubicacionFinal extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion_final);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String marcador = getIntent().getStringExtra("marcador");
        double latitud = Double.parseDouble(getIntent().getStringExtra("longitud"));
        double longitud = Double.parseDouble(getIntent().getStringExtra("latitud"));


        // Add a marker in Sydney and move the camera
        LatLng ubicacion = new LatLng(longitud,latitud);
        mMap.addMarker(new MarkerOptions().position(ubicacion).title(marcador));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ubicacion));
    }
}
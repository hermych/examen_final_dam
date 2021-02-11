package com.dam.examen_final_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class formularioUbicacion extends AppCompatActivity {
    Button btnUbicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_ubicacion);
        btnUbicacion = findViewById(R.id.buttonUbicacion);
        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( formularioUbicacion.this, ubicacionFinal.class);
                startActivity(i);

            }
        });
    }
}
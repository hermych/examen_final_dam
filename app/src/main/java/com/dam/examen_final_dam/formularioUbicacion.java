package com.dam.examen_final_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class formularioUbicacion extends AppCompatActivity {
    Button btnUbicacion;
    private EditText editTextTextPersonName2, editTextTextPersonName3, editTextTextPersonName4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_ubicacion);
        editTextTextPersonName2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = (EditText)findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = (EditText)findViewById(R.id.editTextTextPersonName4);
        btnUbicacion = findViewById(R.id.buttonUbicacion);
        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( formularioUbicacion.this, ubicacionFinal.class);
                i.putExtra("longitud",editTextTextPersonName2.getText().toString());
                i.putExtra("latitud",editTextTextPersonName3.getText());
                i.putExtra("marcador",editTextTextPersonName4.getText());
                startActivity(i);

            }
        });
    }
}
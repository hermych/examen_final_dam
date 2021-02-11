package com.dam.examen_final_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class formularioUbicacion extends AppCompatActivity {
    Button buttonUbicacion;
    private EditText editTextTextPersonName2, editTextTextPersonName3, editTextTextPersonName4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_ubicacion);
        editTextTextPersonName2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = (EditText)findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = (EditText)findViewById(R.id.editTextTextPersonName4);
        buttonUbicacion = findViewById(R.id.buttonUbicacion);
    }

    public void Enviar(View view){
        Intent  i = new Intent(this, ubicacionFinal.class);
        i.putExtra("dato1", editTextTextPersonName2.getText().toString());
        i.putExtra("dato2", editTextTextPersonName3.getText().toString());
        i.putExtra("dato3", editTextTextPersonName4.getText().toString());
        startActivity(i);
    }
}
package com.dam.examen_final_dam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    private EditText editTextTextPersonName2, editTextTextPersonName3, editTextTextPersonName4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = (EditText)findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = (EditText)findViewById(R.id.editTextTextPersonName4);


        btnLogin = findViewById(R.id.button);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( MainActivity.this, formularioUbicacion.class);
                i.putExtra("longitud",editTextTextPersonName2.getText().toString());
                i.putExtra("latitud",editTextTextPersonName3.getText());
                i.putExtra("marcador",editTextTextPersonName4.getText());
                startActivity(i);

            }
        });
    }
}
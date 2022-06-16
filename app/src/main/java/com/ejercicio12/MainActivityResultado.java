package com.ejercicio12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityResultado extends AppCompatActivity {
TextView nombre,apellido,edad,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultado);

        nombre=(TextView) nombre.findViewById(R.id.datonombre);
        apellido=(TextView) apellido.findViewById(R.id.datoapellido);
        edad=(TextView) edad.findViewById(R.id.datoedad);
        correo=(TextView) correo.findViewById(R.id.datocorreo);

        nombre.setText(getIntent().getStringExtra("Pnombre"));
        apellido.setText(getIntent().getStringExtra("Papellido"));
        edad.setText(getIntent().getStringExtra("Pedad"));
        correo.setText(getIntent().getStringExtra("Pcorreo"));
    }
    private Intent getIntent(){

    }
}
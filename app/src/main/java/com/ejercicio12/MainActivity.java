package com.ejercicio12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ejercicio12.configuraciondatos.Personas;

public class MainActivity extends AppCompatActivity {
EditText editTNombre,editTApellido,editTEdad,editTCorreo;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTNombre=(EditText) findViewById(R.id.txtnombre);
        editTNombre=(EditText) findViewById(R.id.txtapellido);
        editTNombre=(EditText) findViewById(R.id.txtedad);
        editTNombre=(EditText) findViewById(R.id.txtcorreoelectronico);

        btnEnviar=(Button) findViewById(R.id.btnenviarinformacion);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Personas datosPersona = new Personas();
                datosPersona.setNombre(editTNombre.getText().toString());
                datosPersona.setApellido(editTApellido.getText().toString());
                datosPersona.setEdad(editTEdad.getText().toString());
                datosPersona.setCorreo(editTCorreo.getText().toString());

                //Codigo para el envio de datos ala otra ventana
                Intent ventana2 = new Intent(getApplicationContext(),MainActivityResultado.class);
                ventana2.putExtra("Pnombre",datosPersona.getNombre());
                ventana2.putExtra("Papellido",datosPersona.getApellido());
                ventana2.putExtra("Pedad",datosPersona.getEdad());
                ventana2.putExtra("Pcorreo",datosPersona.getCorreo());
                startActivity(ventana2);

            }
        });
    }
}
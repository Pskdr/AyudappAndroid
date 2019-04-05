package com.example.appalertas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PantallaRegistrar1 extends AppCompatActivity {
Button  btnRegistrar, btnIngresarRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registrar_1);
        conectar();
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Registro exitoso", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), PantallaInicial2.class);
                startActivity(i);
            }
        });

        btnIngresarRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PantallaInicial2.class);
                startActivity(i);
            }
        });

    }


    private void conectar(){

        btnRegistrar = findViewById(R.id.btnRegistrarGuardar);
        btnIngresarRegistro = findViewById(R.id.btnIngresarRegistro);


    }
}

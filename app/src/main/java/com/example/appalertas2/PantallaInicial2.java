package com.example.appalertas2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PantallaInicial2 extends AppCompatActivity {
    EditText txtEmail, txtContrasena;
    Button btnIng, btnMenuRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicial_2);
        conectar();


        btnMenuRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PantallaRegistrar1.class);
                startActivity(i);
            }
        });
        btnIng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtEmail.getText().toString().equals("") || txtContrasena.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Ingrese el correo electronico y la contraseña", Toast.LENGTH_LONG).show();
                } else {

                    Intent i = new Intent(getApplicationContext(), PantallaEmergenciaPrincipal.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), "Inicio exitoso", Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    private void conectar() {

        txtContrasena = findViewById(R.id.etContraseña);
        txtEmail = findViewById(R.id.etEmail);
        btnIng = findViewById(R.id.btnIng);
        btnMenuRegistro = findViewById(R.id.btnRegistrarInicio2);
    }
}

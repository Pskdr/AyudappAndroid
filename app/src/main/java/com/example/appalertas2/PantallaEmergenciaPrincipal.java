package com.example.appalertas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PantallaEmergenciaPrincipal extends AppCompatActivity {
    Button btnEmergenciaPrincipal, btnMiPerfilPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_emergencia_principal);
        conectar();
        btnMiPerfilPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PantallaMiPerfil.class);
                startActivity(i);
            }
        });
        //Comentario prueba
        btnEmergenciaPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "La ayuda va en camino", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), PantallaEmergenciaPrincipal.class);
                startActivity(i);
            }
        });


    }
    private void conectar(){
        btnMiPerfilPrincipal = findViewById(R.id.btnMiPerfilPrincipal);
        btnEmergenciaPrincipal = findViewById(R.id.btnEmergenciaPrincipal);

    }

}

package com.libreflix.libreflixApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AbaBuscarActivity extends AppCompatActivity {

    private PerfilUsuario perfilUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ababuscar);

        perfilUsuario = (PerfilUsuario) getIntent().getSerializableExtra("perfilUsuario");

        ImageView imageView = findViewById(R.id.imageView13);
        EditText campoBusca = findViewById(R.id.buscar10);

        Button limpar = findViewById(R.id.buscar);
        Button salvos = findViewById(R.id.buscar3);
        Button home = findViewById(R.id.filmeHome);
        Button buscar = findViewById(R.id.buscar5);
        Button emAlta = findViewById(R.id.buscar6);


        limpar.setOnClickListener(new View.OnClickListener() {// oi
            @Override
            public void onClick(View v) {
                campoBusca.setText("");
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaBuscarActivity.this, HomeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaBuscarActivity.this, AbaBuscarActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        emAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaBuscarActivity.this, AbaEmAltaActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        salvos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaBuscarActivity.this, AbaSalvosActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });
    }
}

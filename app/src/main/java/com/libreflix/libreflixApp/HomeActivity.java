package com.libreflix.libreflixApp;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    // Declaração dos componentes
    private PerfilUsuario perfilUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Recupera os dados do perfilUsuario enviados pela Intent
        perfilUsuario = (PerfilUsuario) getIntent().getSerializableExtra("perfilUsuario");

        // Inicializando os componentes
        ImageView imagemFundo = findViewById(R.id.imageView14);
        Button botaoPerfil = findViewById(R.id.home);
        Button botaoHome = findViewById(R.id.home2);
        Button botaoSalvos = findViewById(R.id.home3);
        Button botaoBuscar = findViewById(R.id.home4);
        Button botaoEmAlta = findViewById(R.id.home5);

        // Tornando os botões visíveis
        botaoPerfil.setVisibility(View.VISIBLE);
        botaoHome.setVisibility(View.VISIBLE);
        botaoSalvos.setVisibility(View.VISIBLE);
        botaoBuscar.setVisibility(View.VISIBLE);
        botaoEmAlta.setVisibility(View.VISIBLE);

        // Ações para os botões
        botaoPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PerfilActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        botaoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        botaoSalvos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AbaSalvosActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        botaoBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,AbaBuscarActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        botaoEmAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AbaEmAltaActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

    }
}
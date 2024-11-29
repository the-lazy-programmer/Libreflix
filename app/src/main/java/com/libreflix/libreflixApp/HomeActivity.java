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
        botaoPerfil.setOnClickListener(view -> abrirPerfil());
        botaoHome.setOnClickListener(view -> abrirPaginaInicial());
        botaoSalvos.setOnClickListener(view -> abrirItensSalvos());
        botaoBuscar.setOnClickListener(view -> abrirBusca());
        botaoEmAlta.setOnClickListener(view -> abrirEmAlta());
    }

    // Métodos auxiliares para cada funcionalidade
    private void abrirPerfil() {
        Intent intent = new Intent(this, PerfilActivity.class);
        intent.putExtra("perfilUsuario", (CharSequence) perfilUsuario);
        startActivity(intent);
    }

    private void abrirPaginaInicial() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("perfilUsuario", (CharSequence) perfilUsuario);
        startActivity(intent);
    }

    private void abrirItensSalvos() {
        Intent intent = new Intent(this, AbaSalvosActivity.class);
        intent.putExtra("perfilUsuario", (CharSequence) perfilUsuario);
        startActivity(intent);
    }

    private void abrirBusca() {
        Intent intent = new Intent(this, AbaBuscarActivity.class);
        intent.putExtra("perfilUsuario", (CharSequence) perfilUsuario);
        startActivity(intent);
    }

    private void abrirEmAlta() {
        Intent intent = new Intent(this, AbaEmAltaActivity.class);
        intent.putExtra("perfilUsuario", (CharSequence) perfilUsuario);
        startActivity(intent);
    }
}
package com.libreflix.libreflixApp;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    // Declaração dos componentes
    private PerfilUsuario perfilUsuario;
    private ImageView imagemFundo;
    private Button botaoPerfil;
    private Button botaoHome;
    private Button botaoSalvos;
    private Button botaoBuscar;
    private Button botaoEmAlta;

    public HomeActivity(PerfilUsuario perfilUsuario){
        this.perfilUsuario = perfilUsuario;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Inicializando os componentes
        imagemFundo = findViewById(R.id.imageView14);
        botaoPerfil = findViewById(R.id.home);
        botaoHome = findViewById(R.id.home2);
        botaoSalvos = findViewById(R.id.home3);
        botaoBuscar = findViewById(R.id.home4);
        botaoEmAlta = findViewById(R.id.home5);

        // Tornando os botões visíveis
        botaoPerfil.setVisibility(View.VISIBLE);
        botaoHome.setVisibility(View.VISIBLE);
        botaoSalvos.setVisibility(View.VISIBLE);
        botaoBuscar.setVisibility(View.VISIBLE);
        botaoEmAlta.setVisibility(View.VISIBLE);

        // Ações para os botões
        botaoPerfil.setOnClickListener(view -> {
            // Lógica ao clicar no botão "Perfil"
            abrirPerfil();
        });

        botaoHome.setOnClickListener(view -> {
            // Lógica ao clicar no botão "Home"
            abrirPaginaInicial();
        });

        botaoSalvos.setOnClickListener(view -> {
            // Lógica ao clicar no botão "Salvos"
            abrirItensSalvos();
        });

        botaoBuscar.setOnClickListener(view -> {
            // Lógica ao clicar no botão "Buscar"
            abrirBusca();
        });

        botaoEmAlta.setOnClickListener(view -> {
            // Lógica ao clicar no botão "Em Alta"
            abrirEmAlta();
        });
    }

    // Métodos auxiliares para cada funcionalidade
    private void abrirPerfil() {
        // Implementar lógica para abrir perfil
    }

    private void abrirPaginaInicial() {
        // Implementar lógica para abrir a página inicial
    }

    private void abrirItensSalvos() {
        // Implementar lógica para abrir itens salvos
    }

    private void abrirBusca() {
        // Implementar lógica para abrir busca
    }

    private void abrirEmAlta() {
        // Implementar lógica para abrir a página "Em Alta"
    }
}

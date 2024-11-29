package com.libreflix.libreflixApp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PopupSairActivity extends AppCompatActivity {

    // Declaração dos componentes
    private ImageView imagemConfirmacao;
    private Button botaoSairPerfil;
    private Button botaoVoltarPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_sair);


        imagemConfirmacao = findViewById(R.id.imageView10);
        botaoSairPerfil = findViewById(R.id.sairPerfil);
        botaoVoltarPerfil = findViewById(R.id.voltarPerfil);


        botaoSairPerfil.setVisibility(View.VISIBLE);
        botaoVoltarPerfil.setVisibility(View.VISIBLE);


        botaoSairPerfil.setOnClickListener(view -> {

            finish();
        });


        botaoVoltarPerfil.setOnClickListener(view -> {
            finish();
        });
    }
}

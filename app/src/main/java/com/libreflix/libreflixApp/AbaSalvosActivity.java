package com.libreflix.libreflixApp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AbaSalvosActivity extends AppCompatActivity {

    private PerfilUsuario perfilUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abasalvos);

        perfilUsuario = (PerfilUsuario) getIntent().getSerializableExtra("perfilUsuario");

        ImageView imageView12 = findViewById(R.id.imageView12);
        ImageView imageView19 = findViewById(R.id.imageView19);
        ImageView imageView21 = findViewById(R.id.imageView21);
        ImageView imageView22 = findViewById(R.id.imageView22);

        Button salvos3 = findViewById(R.id.salvos3);
        Button salvos4 = findViewById(R.id.salvos4);
        Button salvos5 = findViewById(R.id.salvos5);
        Button salvos6 = findViewById(R.id.salvos6);
        Button salvos7 = findViewById(R.id.salvos7);
        Button salvos8 = findViewById(R.id.salvos8);
        Button salvos9 = findViewById(R.id.salvos9);
        Button salvos10 = findViewById(R.id.salvos10);

        salvos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        salvos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        salvos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        salvos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        salvos7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        salvos8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        salvos9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        salvos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}


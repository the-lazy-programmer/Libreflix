package com.libreflix.libreflixApp;

import android.content.Intent;
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

        Button salvos3 = findViewById(R.id.homeSalvos);
        Button salvos4 = findViewById(R.id.salvosSalvos);
        Button salvos5 = findViewById(R.id.salvosBuscar);
        Button salvos6 = findViewById(R.id.salvosEmAlta);
        Button salvos7 = findViewById(R.id.salvos7);
        Button salvos8 = findViewById(R.id.salvos8);
        Button salvos9 = findViewById(R.id.salvos9);
        Button salvos10 = findViewById(R.id.salvos10);

        salvos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaSalvosActivity.this, HomeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        salvos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaSalvosActivity.this, AbaSalvosActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        salvos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaSalvosActivity.this, AbaBuscarActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        salvos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaSalvosActivity.this, AbaEmAltaActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        salvos7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaSalvosActivity.this, TelaFilmeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        salvos8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaSalvosActivity.this, TelaFilmeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        salvos9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaSalvosActivity.this, TelaFilmeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        salvos10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaSalvosActivity.this, TelaFilmeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });
    }
}


package com.libreflix.libreflixApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class AbaEmAltaActivity extends AppCompatActivity {

    private PerfilUsuario perfilUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaemalta);

        perfilUsuario = (PerfilUsuario) getIntent().getSerializableExtra("perfilUsuario");

        // Inicializando os componentes da interface
        Button btnVoltar = findViewById(R.id.emalta);
        Button btnMaisVisto = findViewById(R.id.emalta2);
        Button btnMaisReview = findViewById(R.id.emalta3);
        Button btnNovidades = findViewById(R.id.emalta4);
        Button btnHome = findViewById(R.id.emalta5);
        Button btnSalvos = findViewById(R.id.emalta6);
        Button btnBuscar = findViewById(R.id.emalta7);
        Button btnEmAlta = findViewById(R.id.emalta8);
        ImageView imgEmAlta = findViewById(R.id.imageView8);


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaEmAltaActivity.this, HomeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        btnMaisVisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaEmAltaActivity.this, HomeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        btnMaisReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaEmAltaActivity.this, HomeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        btnNovidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaEmAltaActivity.this, HomeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaEmAltaActivity.this, HomeActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        btnSalvos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaEmAltaActivity.this, AbaSalvosActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaEmAltaActivity.this, AbaBuscarActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });

        btnEmAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AbaEmAltaActivity.this, AbaEmAltaActivity.class);
                intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
                startActivity(intent);
            }
        });
    }
}

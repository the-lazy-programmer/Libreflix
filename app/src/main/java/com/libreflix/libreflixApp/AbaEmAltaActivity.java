package com.libreflix.libreflixApp;

import android.os.Bundle;
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


        btnVoltar.setOnClickListener(v -> finish());
        btnMaisVisto.setOnClickListener(v -> {
            // Ação para o botão "Mais Visto"
        });
        btnMaisReview.setOnClickListener(v -> {
            // Ação para o botão "Mais Review"
        });
        btnNovidades.setOnClickListener(v -> {
            // Ação para o botão "Novidades"
        });
        btnHome.setOnClickListener(v -> {
            // Ação para o botão "Home"
        });
        btnSalvos.setOnClickListener(v -> {
            // Ação para o botão "Salvos"
        });
        btnBuscar.setOnClickListener(v -> {
            // Ação para o botão "Buscar"
        });
        btnEmAlta.setOnClickListener(v -> {
            // Ação para o botão "Em Alta"
        });
    }
}

package com.libreflix.libreflixApp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class AbaEmAltaActivity extends AppCompatActivity {

    private Button btnVoltar;
    private Button btnMaisVisto;
    private Button btnMaisReview;
    private Button btnNovidades;
    private Button btnHome;
    private Button btnSalvos;
    private Button btnBuscar;
    private Button btnEmAlta;
    private ImageView imgEmAlta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abaemalta);

        // Inicializando os componentes da interface
        btnVoltar = findViewById(R.id.emalta);
        btnMaisVisto = findViewById(R.id.emalta2);
        btnMaisReview = findViewById(R.id.emalta3);
        btnNovidades = findViewById(R.id.emalta4);
        btnHome = findViewById(R.id.emalta5);
        btnSalvos = findViewById(R.id.emalta6);
        btnBuscar = findViewById(R.id.emalta7);
        btnEmAlta = findViewById(R.id.emalta8);
        imgEmAlta = findViewById(R.id.imageView8);


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

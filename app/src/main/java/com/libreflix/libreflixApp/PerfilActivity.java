package com.libreflix.libreflixApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PerfilActivity extends AppCompatActivity {

    private PerfilUsuario perfilUsuario;
    private PerfilUsuarioDAO perfilUsuarioDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        // Retrieve perfilUsuario from Intent extras
        perfilUsuario = (PerfilUsuario) getIntent().getSerializableExtra("perfilUsuario");

        // Initialize PopupWindow for 'sairPerfil'
        View popupView = LayoutInflater.from(this).inflate(R.layout.sair_popup, null);
        PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);

        Button home = findViewById(R.id.home);
        Button trocar = findViewById(R.id.trocar);
        Button sairPerfil = findViewById(R.id.sairPerfil);

        if (perfilUsuario != null) {
            perfilUsuarioDAO = Dados.getDatabase(this).perfilUsuarioDAO();

            // Save perfilUsuario to Room database in a separate thread
            new Thread(() -> perfilUsuarioDAO.salvarPerfil(perfilUsuario)).start();

            TextView nomeUsuario = findViewById(R.id.nomeUsuario);
            TextView emailUsuario = findViewById(R.id.emailUsuario);
            nomeUsuario.setText(perfilUsuario.getNome());
            emailUsuario.setText(perfilUsuario.getEmail());
        }

        home.setOnClickListener(v -> navigateToActivity(HomeActivity.class));

        trocar.setOnClickListener(v -> {
            finish();
        });

        sairPerfil.setOnClickListener(v -> {
            finish();
        });
    }

    private void navigateToActivity(Class<?> activityClass) {
        Intent intent = new Intent(PerfilActivity.this, activityClass);
        intent.putExtra("perfilUsuario", (CharSequence) perfilUsuario); // Pass the user profile if needed
        startActivity(intent);
    }
}
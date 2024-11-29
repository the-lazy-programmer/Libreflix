package com.libreflix.libreflixApp;

import android.content.Context;
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

    private final PerfilUsuario perfilUsuario;
    private PerfilUsuarioDAO perfilUsuarioDAO;

    public PerfilActivity(PerfilUsuario perfilUsuario){
        this.perfilUsuario = perfilUsuario;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Button home = findViewById(R.id.home);
        Button trocar = findViewById(R.id.trocar);
        Button config = findViewById(R.id.config);
        Button plano = findViewById(R.id.plano);
        Button ajuda = findViewById(R.id.ajuda);
        Button sairPerfil = findViewById(R.id.sairPerfil);

        if(perfilUsuario != null){

            perfilUsuarioDAO = Dados.getDatabase(this).perfilUsuarioDAO();

            new Thread(() -> {
                perfilUsuarioDAO.salvarPerfil(perfilUsuario); // Room operations must be done on a separate thread
            }).start();

            TextView nomeUsuario = findViewById(R.id.nomeUsuario);
            TextView emailUsuario = findViewById(R.id.emailUsuario);
            nomeUsuario.setText(perfilUsuario.getNome());
            emailUsuario.setText(perfilUsuario.getEmail());


        }

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeActivity homeActivity = new HomeActivity(perfilUsuario);
                Intent intent = new Intent(PerfilActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });



    }
}
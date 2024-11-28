package com.libreflix.libreflixApp;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class DAOButtons extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
    }

    public void onClick(@NonNull Button button) {
        if(button.getId() == R.id.home) {
            setContentView(R.layout.activity_home);
        //} else if(button.getId() == R.id.perfil) {
        //    setContentView(R.layout.activity_perfil);
        } else if(button.getId() == R.id.entrar) {
            setContentView(R.layout.activity_entrar);
        } else if(button.getId() == R.id.trocar) {
            // TODO: Definir tela depois!!!
        } else if(button.getId() == R.id.config) {
            // TODO: Definir tela depois!!!
        } else if(button.getId() == R.id.plano) {
            // TODO: Definir tela depois!!!
        } else if(button.getId() == R.id.ajuda) {
            // TODO: Definir tela depois!!!
        } else if(button.getId() == R.id.sair) {
            // TODO: Definir popup depois!!!
        }
    }

}

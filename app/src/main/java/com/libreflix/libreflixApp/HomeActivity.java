package com.libreflix.libreflixApp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity{

    private PerfilUsuario perfilUsuario;

    public HomeActivity(PerfilUsuario perfilUsuario){
        this.perfilUsuario = perfilUsuario;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

}

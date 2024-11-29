package com.libreflix.libreflixApp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AbaBuscarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ababuscar);


        ImageView imageView = findViewById(R.id.imageView13);
        EditText campoBusca = findViewById(R.id.buscar10);

        Button limpar = findViewById(R.id.buscar);
        Button home = findViewById(R.id.buscar2);
        Button buscar = findViewById(R.id.buscar5);
        Button emAlta = findViewById(R.id.buscar6);


        limpar.setOnClickListener(new View.OnClickListener() {// oi
            @Override
            public void onClick(View v) {
                campoBusca.setText("");
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoBusca = campoBusca.getText().toString();

            }
        });

        emAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  // oi

            }
        });
    }
}

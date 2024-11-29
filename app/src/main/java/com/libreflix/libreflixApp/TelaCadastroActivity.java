package com.libreflix.libreflixApp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaCadastroActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoSenha;
    private Button botaoCriarConta;
    private Button botaoEntrarConta;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacadastro);

        // Inicializando os componentes
        campoNome = findViewById(R.id.campoName);
        campoEmail = findViewById(R.id.campoEmail);
        campoSenha = findViewById(R.id.campoSenha);
        botaoCriarConta = findViewById(R.id.CriarConta);
        botaoEntrarConta = findViewById(R.id.EntrarConta);


        botaoCriarConta.setVisibility(Button.VISIBLE);
        botaoEntrarConta.setVisibility(Button.VISIBLE);


        botaoCriarConta.setOnClickListener(view -> {

            String nome = campoNome.getText().toString();
            String email = campoEmail.getText().toString();
            String senha = campoSenha.getText().toString();

        });

        botaoEntrarConta.setOnClickListener(view -> {

        });
    }
}

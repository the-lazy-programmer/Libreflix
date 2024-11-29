package com.libreflix.libreflixApp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaCadastroActivity extends AppCompatActivity {

    private PerfilUsuario perfilUsuario;

    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoSenha;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telacadastro);

        perfilUsuario = (PerfilUsuario) getIntent().getSerializableExtra("perfilUsuario");

        // Inicializando os componentes
        campoNome = findViewById(R.id.campoName);
        campoEmail = findViewById(R.id.campoEmail);
        campoSenha = findViewById(R.id.campoSenha);
        Button botaoCriarConta = findViewById(R.id.CriarConta);
        Button botaoEntrarConta = findViewById(R.id.EntrarConta);


        botaoCriarConta.setVisibility(Button.VISIBLE);
        botaoEntrarConta.setVisibility(Button.VISIBLE);


        botaoCriarConta.setOnClickListener(view -> {

            String email = campoEmail.getText().toString();
            String username = campoNome.getText().toString();
            String password = campoSenha.getText().toString();

            // Set perfilUsuario details
            perfilUsuario.setId((int) (Math.random() * 49 + 1)); // Example random ID
            perfilUsuario.setNome(username);
            perfilUsuario.setEmail(email);
            perfilUsuario.setSenha(password);

            // Start HomeActivity
            Intent intent = new Intent(TelaCadastroActivity.this, HomeActivity.class);
            intent.putExtra("perfilUsuario", perfilUsuario); // Pass as Serializable
            startActivity(intent);

        });

        botaoEntrarConta.setOnClickListener(view -> {
            Intent intent = new Intent(TelaCadastroActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}

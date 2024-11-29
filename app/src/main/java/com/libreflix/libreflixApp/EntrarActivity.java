package com.libreflix.libreflixApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EntrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);

        // Referenciar os elementos do layout
        EditText emailField = findViewById(R.id.editTextTextEmailAddress);
        EditText passwordField = findViewById(R.id.editTextTextPassword);
        Button entrarButton = findViewById(R.id.entrar);
        Button entrarConvidadoButton = findViewById(R.id.entrarConvidado);
        Button criarContaButton = findViewById(R.id.CriarConta);

        // Configurar botão "Entrar"
        entrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailField.getText().toString().trim();
                String password = passwordField.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(EntrarActivity.this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                } else {
                    // Lógica de autenticação pode ser inserida aqui
                    Intent intent = new Intent(EntrarActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        // Configurar botão "Entrar como Convidado"
        entrarConvidadoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntrarActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Configurar botão "Criar Conta"
        criarContaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntrarActivity.this, TelaCadastroActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.libreflix.libreflixApp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaCadastroActivity extends AppCompatActivity {

    // joao pfv corrigir os IDS  helppppp :/
    private ImageView imagemCadastro;
    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoSenha;
    private EditText campoConfirmacaoSenha;
    private Button botaoCriarConta;
    private Button botaoEntrarConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Inicializando os componentes
        imagemCadastro = findViewById(R.id.imageView17);
        campoNome = findViewById(R.id.editTextTextPersonName);
        campoEmail = findViewById(R.id.editTextTextEmailAddress);
        campoSenha = findViewById(R.id.editTextTextPassword);
        campoConfirmacaoSenha = findViewById(R.id.editTextTextPassword2); // Ajuste para IDs duplicados
        botaoCriarConta = findViewById(R.id.CriarConta);
        botaoEntrarConta = findViewById(R.id.EntrarConta);


        botaoCriarConta.setVisibility(Button.VISIBLE);
        botaoEntrarConta.setVisibility(Button.VISIBLE);


        botaoCriarConta.setOnClickListener(view -> {

            String nome = campoNome.getText().toString();
            String email = campoEmail.getText().toString();
            String senha = campoSenha.getText().toString();
            String confirmacaoSenha = campoConfirmacaoSenha.getText().toString();

            if (!senha.equals(confirmacaoSenha)) {
                campoSenha.setError("As senhas não coincidem");
                campoConfirmacaoSenha.setError("As senhas não coincidem");
            } else {

            }
        });

        botaoEntrarConta.setOnClickListener(view -> {

        });
    }
}

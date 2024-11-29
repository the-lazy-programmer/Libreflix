package com.libreflix.libreflixApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private PerfilUsuario perfilUsuario;
    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);

        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.campoUsername);
        Button buttonLogin = findViewById(R.id.entrar);
        Button buttonConvidado = findViewById(R.id.entrarConvidado);

        // Initialize PopupWindow
        View popupView = LayoutInflater.from(this).inflate(R.layout.sair_popup, null);
        popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);

        perfilUsuario = new PerfilUsuario(); // Initialize perfilUsuario

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String username = extractUsernameFromEmail(email);
                String password = editTextPassword.getText().toString();

                // Set perfilUsuario details
                perfilUsuario.setId((int) (Math.random() * 49 + 1)); // Example random ID
                perfilUsuario.setNome(username);
                perfilUsuario.setEmail(email);
                perfilUsuario.setSenha(password);

                // Start HomeActivity
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("perfilUsuario", (CharSequence) perfilUsuario); // Pass perfilUsuario to HomeActivity
                startActivity(intent);
            }
        });

        buttonConvidado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pass empty or default user profile for guest
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private String extractUsernameFromEmail(String email) {
        String[] domains = {
                "@cesar.school", "@gmail.com", "@hotmail.com", "@outlook.com", "@yahoo.com",
                "@gmail.com.br", "@hotmail.com.br", "@outlook.com.br", "@yahoo.com.br"
        };

        for (String domain : domains) {
            if (email.contains(domain)) {
                return email.replace(domain, "");
            }
        }
        return email; // Return original email if no domain matches
    }
}
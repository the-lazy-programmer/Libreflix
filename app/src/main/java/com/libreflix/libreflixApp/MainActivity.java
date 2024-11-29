package com.libreflix.libreflixApp;

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
    PerfilUsuario perfilUsuario;
    View popupView = LayoutInflater.from(this).inflate(R.layout.sair_popup, null);
    PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);


        editTextEmail = findViewById(R.id.editTextTextEmailAddress);

        editTextPassword = findViewById(R.id.editTextTextPassword);
        Button buttonLogin = findViewById(R.id.entrar);
        Button buttonConvidado = findViewById(R.id.entrarConvidado);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editTextEmail.getText().toString();

                String username;

                if(email.contains("@cesar.school")){
                    username = email.replace("@cesar.school", "");
                }else if(email.contains("@gmail.com")){
                    username = email.replace("@gmail.com", "");
                }else if(email.contains("@hotmail.com")){
                    username = email.replace("@hotmail.com", "");
                }else if(email.contains("@outlook.com")){
                    username = email.replace("@outlook.com", "");
                }else if(email.contains("@yahoo.com")){
                    username = email.replace("@yahoo.com", "");
                }else if(email.contains("@gmail.com.br")){
                    username = email.replace("@gmail.com.br", "");
                }else if(email.contains("@hotmail.com.br")){
                    username = email.replace("@hotmail.com", "");
                }else if(email.contains("@outlook.com.br")){
                    username = email.replace("@outlook.com", "");
                }else if(email.contains("@yahoo.com.br")){
                    username = email.replace("@yahoo.com", "");
                }else{
                    username = email;
                }

                String password = editTextPassword.getText().toString();

                perfilUsuario.setId((int) (Math.random() * 49 + 1));
                perfilUsuario.setNome(username);
                perfilUsuario.setEmail(email);
                perfilUsuario.setSenha(password);

                HomeActivity homeActivity = new HomeActivity(perfilUsuario);

            }
        });

        buttonConvidado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
package com.libreflix.libreflixApp;

public class AjudaActivity {

    private String nome;
    private String email;
    private String senha;

    public void registrarUsuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }

    public boolean verificarInformacoes() {

        return nome != null && !nome.isEmpty() &&
                email != null && !email.isEmpty() &&
                senha != null && !senha.isEmpty();
    }
}

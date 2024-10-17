package com.libreflix.libreflixApp;

public class PerfilActivity {

    private String nome;
    private String username;
    private String email;
    private String local;
    private String website;
    private String capaURL;
    private String senha;


    public PerfilActivity(String email, String username, String senha) {
        this.email = email;
        this.username = username;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCapaURL() {
        return capaURL;
    }

    public void setCapaURL(String capaURL) {
        this.capaURL = capaURL;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}


package com.libreflix.libreflixApp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "perfil_usuario")
public class PerfilUsuario {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String nome;
    private String email;
    private String senha;

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
}
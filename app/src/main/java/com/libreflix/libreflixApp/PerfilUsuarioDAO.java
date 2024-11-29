package com.libreflix.libreflixApp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface PerfilUsuarioDAO {

    @Insert
    void salvarPerfil(PerfilUsuario perfil);

    @Query("SELECT * FROM perfil_usuario WHERE email = :email AND senha = :senha LIMIT 1")
    PerfilUsuario carregarPerfil(String email, String senha);

    @Update
    void atualizarPerfil(PerfilUsuario perfil);

    @Query("DELETE FROM perfil_usuario WHERE email = :email AND senha = :senha")
    void excluirPerfil(String email, String senha);
}

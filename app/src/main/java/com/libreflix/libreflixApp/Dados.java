package com.libreflix.libreflixApp;

import android.content.Context;
import androidx.room.RoomDatabase;

public abstract class Dados extends  RoomDatabase {

    public abstract PerfilUsuarioDAO perfilUsuarioDAO();

    private static volatile Dados INSTANCE;

    public static Dados getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (Dados.class) {
                if (INSTANCE == null) {
                    INSTANCE = androidx.room.Room.databaseBuilder(context.getApplicationContext(),
                                    Dados.class, "user_profiles")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}

package com.libreflix.libreflixApp;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaFilmeActivity extends AppCompatActivity {

    private PerfilUsuario perfilUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telafilme);

        perfilUsuario = (PerfilUsuario) getIntent().getSerializableExtra("perfilUsuario");

        // Inicializando os componentes do layout
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);
        ImageView imageView7 = findViewById(R.id.imageView7);

        TextView textView = findViewById(R.id.textView);

        Button playButton = findViewById(R.id.play);
        Button fullscreenButton = findViewById(R.id.fullscreen);

        VideoView videoView2 = findViewById(R.id.videoView2);

        // Configurando o VideoView
        //Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sample_video); // trocar pelo filme
        //videoView2.setVideoURI(videoUri);
        videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true); // Configura o vídeo para repetir automaticamente
                videoView2.start(); // Inicia o vídeo ao abrir a tela
            }
        });

        // Configurando o botão "Play"
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (videoView2.isPlaying()) {
                    videoView2.pause();
                    playButton.setText("Play");
                } else {
                    videoView2.start();
                    playButton.setText("Pause");
                }
            }
        });

        // Configurando o botão "FullScreen"
        fullscreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Exemplo de ação para tela cheia
                textView.setText("Entrando em tela cheia..."); // Substitua com funcionalidade real se necessário
            }
        });
    }
}

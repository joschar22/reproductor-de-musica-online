package com.example.pf_radio;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
public class MainActivity extends AppCompatActivity {
    private ImageView imagePlay,btnStop;
    private String url = "https://host3.audiolatam.com/8030/stream";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagePlay=findViewById(R.id.imagePlay);
        btnStop=findViewById(R.id.btnStop);
        ExoPlayer player=new ExoPlayer.Builder(this).build();
        imagePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaItem miradio=MediaItem.fromUri((url));
                player.setMediaItem(miradio);
                player.prepare();
                player .play();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 player.stop();
            }
        });
    }
}
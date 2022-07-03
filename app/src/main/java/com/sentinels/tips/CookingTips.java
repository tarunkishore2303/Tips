package com.sentinels.tips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class CookingTips extends AppCompatActivity {

    Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking_tips);
        VideoView videoView = findViewById(R.id.videoView2);

        MediaPlayer mp=new MediaPlayer();
        MediaController mc=new MediaController(this);
        mc.setAnchorView(videoView);

        button1 = (Button) findViewById(R.id.button5);
        button2 = (Button) findViewById(R.id.button6);
        button3 = (Button) findViewById(R.id.button7);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("/storage/emulated/0/Download/Valorant 2022.06.30 - 15.54.21.05.DVR_Trim.mp4");
                videoView.setVideoURI(uri);
                videoView.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://dev.to")));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://medium.com")));
            }
        });
    }
}
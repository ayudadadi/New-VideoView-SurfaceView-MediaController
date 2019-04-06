package com.example.videoview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
    private VideoView myVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myVideoView = findViewById(R.id.myVideoView);
        myVideoView.setVideoPath("/mnt/shared/Other/family.mp4");
        myVideoView.start();
        MediaController mediaController = new MediaController(MainActivity.this);
        myVideoView.setMediaController(mediaController);
    }
}

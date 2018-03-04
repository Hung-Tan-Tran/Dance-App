package com.example.haniel.dance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video_Info_Activity extends  YouTubeBaseActivity {


    YouTubePlayerView ytPlayerView;
    TextView label;
    public static final String KEY = "AIzaSyBcbKYvdoTFD-0b_FX-G3rj4gSj2fEtknI";

    YouTubePlayer.OnInitializedListener myInitializer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__info);

        label = (TextView) findViewById(R.id.tv_url);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        final String VideoURL = intent.getExtras().getString("VideoURL");

        ytPlayerView = (YouTubePlayerView) findViewById(R.id.video_view);
        label.setText("Description: "+Description);

        myInitializer = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("VideURL");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {


            }
        };

        ytPlayerView.initialize(KEY, myInitializer);

    }
}

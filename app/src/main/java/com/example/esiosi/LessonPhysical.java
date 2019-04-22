package com.example.esiosi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class LessonPhysical extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {


    static final String GOOGLE_API_KEY = "AIzaSyAoACxRsjrQ1gX5V5hwFHNlnsGYSCfNYms";
    static final String YOUTUBE_VIDEO_ID = "MQUi9NMMO5Y";

    Toolbar toolbar;
    TextView textView;

    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_physical);

        textView = (TextView)findViewById(R.id.textView);

        textView.setText("Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ");


        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);

        youTubePlayerView.initialize(GOOGLE_API_KEY, this);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Physical Layer");


    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID);

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        final int REQUEST_CODE = 1;

        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, REQUEST_CODE).show();
        }
    }

}


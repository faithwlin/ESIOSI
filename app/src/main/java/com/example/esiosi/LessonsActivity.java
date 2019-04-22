package com.example.esiosi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class LessonsActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {


    static final String GOOGLE_API_KEY = "AIzaSyAoACxRsjrQ1gX5V5hwFHNlnsGYSCfNYms";
    static final String YOUTUBE_VIDEO_ID1 = "MQUi9NMMO5Y";
    static final String YOUTUBE_VIDEO_ID2 = "pi7mMjiixiY";
    static final String YOUTUBE_VIDEO_ID3 = "iG-e-pjIIM4";
    static final String YOUTUBE_VIDEO_ID4 = "qSk5SLrg7Yg";
    static final String YOUTUBE_VIDEO_ID5 = "AtITX-U2mL4";
    static final String YOUTUBE_VIDEO_ID6 = "2Abjxmp7TfU";
    static final String YOUTUBE_VIDEO_ID7 = "kAty4mKczEg";

    Toolbar toolbar;
    TextView textView;

    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        textView = (TextView) findViewById(R.id.textView);


        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);

        Bundle bundle = getIntent().getExtras();
        int i = bundle.getInt("topic");

        if (i == 1) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Physical Layer");
            textView.setText("Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ");

        } else if (i == 2) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Data Link Layer");
            textView.setText("Data Link Layer Data Link Layer Data Link Layer Data Link Layer Data Link Layer Data Link Layer Data Link Layer Data Link Layer Data Link Layer Data Link Layer Data Link Layer ");

        } else if (i == 3) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Network Layer");
            textView.setText("Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer Network Layer ");

        } else if (i == 4) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Transport Layer");
            textView.setText("Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer Transport Layer ");
        } else if (i == 5) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Session Layer");
            textView.setText("Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer Session Layer ");

        } else if (i == 6) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Presentation Layer");
            textView.setText("Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer Presentation Layer ");

        } else if (i == 7) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle("Application Layer");
            textView.setText("Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer Application Layer ");

        }


    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


        if (toolbar.getTitle().toString().equalsIgnoreCase("Application Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID1);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Data Link Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID2);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Network Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID3);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Physical Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID4);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Presentation Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID5);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Session Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID6);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Transport Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID7);
        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        final int REQUEST_CODE = 1;

        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, REQUEST_CODE).show();
        }
    }

}


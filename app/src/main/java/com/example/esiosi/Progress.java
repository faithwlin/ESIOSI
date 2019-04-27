package com.example.esiosi;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import static com.example.esiosi.OSILayers.LESSON_KEY;

public class Progress extends Navigation {

    private TextView highscore;
    private TextView lesson;
    public static final String SHARED_PREFERENCES = "sharedPreferences";
    public static final String HIGHSCORE_KEY = "highScoreKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Slide in and out animation for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        // Inflate the layout. Instantiate layout XML file
        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_progress, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.progressnav);

        //Define the TextViews
        highscore = (TextView) findViewById(R.id.highscore);
        lesson = (TextView) findViewById(R.id.lesson);

        //Pulling lesson and highscore data from the shared preferences file
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        String highScore = String.valueOf((preferences.getInt(HIGHSCORE_KEY, 0)) * 10);
        String lessonLevel = String.valueOf(preferences.getInt(LESSON_KEY, 0));

        highscore.setText(highScore + "%");
        lesson.setText(lessonLevel + "/7");


    }
}

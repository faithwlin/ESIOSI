package com.example.esiosi;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.esiosi.OSILayers.LESSON_KEY;

public class Progress extends Navigation {

     TextView score;
     TextView lesson;
     QuizDatabase quizDatabase;
     int i;
    public static final String SHARED_PREFERENCES = "sharedPreferences";
    public static final String HIGHSCORE_KEY = "highScoreKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        quizDatabase = new QuizDatabase(this);
        SQLiteDatabase database = quizDatabase.getReadableDatabase();

        SharedPreferences preferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);

        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_progress, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.progressnav);

        score = (TextView)findViewById(R.id.textView12);
        lesson = (TextView)findViewById(R.id.textView13);


        String s = String.valueOf((preferences.getInt(HIGHSCORE_KEY, 0)) * 10);
        String ss = String.valueOf(preferences.getInt(LESSON_KEY, 0));

        score.setText(s + "%");
        lesson.setText(ss + "/7");





    }
}

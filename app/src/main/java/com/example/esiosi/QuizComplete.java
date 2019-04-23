package com.example.esiosi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QuizComplete extends AppCompatActivity {

    private TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_complete);

        score = (TextView)findViewById(R.id.score);
        Bundle bundle = getIntent().getExtras();

        int mScore = bundle.getInt("Scores");
        score.setText(mScore + " / 10");



    }
}

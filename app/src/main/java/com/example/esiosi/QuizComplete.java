package com.example.esiosi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizComplete extends AppCompatActivity {

    private TextView score;
    private ImageView finish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_complete);

        //Initialise UI element for Quiz Score
        score = (TextView)findViewById(R.id.score);

        //Getting quiz score from QuizActivity's Intent & Bundle
        Bundle bundle = getIntent().getExtras();
        int mScore = bundle.getInt(QuizActivity.TRANSFER_SCORE);
        score.setText(mScore + " / 10");

        //Finish button to go back to QuizHome
        finish = (ImageView)findViewById(R.id.finishButton);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuizComplete.this, QuizHome.class);
                startActivity(i);

            }
        });



    }
}

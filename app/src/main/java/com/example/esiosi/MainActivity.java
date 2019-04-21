package com.example.esiosi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView osiLayersCard, flashcardsCard, quizCard, myprogressCard, myprofileCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define the cards
        osiLayersCard = (CardView) findViewById(R.id.osilayerscard);
        flashcardsCard = (CardView) findViewById(R.id.flashcardscard);
        quizCard = (CardView) findViewById(R.id.quizcard);
        myprogressCard = (CardView) findViewById(R.id.myprogresscard);
        myprofileCard = (CardView) findViewById(R.id.myprofilecard);

        // Add Click Listener to the cards
        osiLayersCard.setOnClickListener(this);
        flashcardsCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
        myprogressCard.setOnClickListener(this);
        myprofileCard.setOnClickListener(this);
    }

    @Override
    // OnClick method will be called when a cardview is clicked
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.osilayerscard : i = new Intent(this,OSILayers.class); startActivity(i); break;
            case R.id.flashcardscard : i = new Intent(this,Flashcards.class); startActivity(i); break;
            case R.id.quizcard : i = new Intent(this,Quiz.class); startActivity(i); break;
            case R.id.myprogresscard : i = new Intent(this,Progress.class); startActivity(i); break;
            case R.id.myprofilecard : i = new Intent(this,Profile.class); startActivity(i); break;
            default:break;

        }

    }
}

package com.example.esiosi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class OSILayers extends AppCompatActivity implements View.OnClickListener {

    private CardView physicalCard, datalinkCard, networkCard, transportCard, sessionCard, presentationCard, applicationCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osilayers);

        // Define the cards
        physicalCard = (CardView) findViewById(R.id.physicalcard);
        datalinkCard = (CardView) findViewById(R.id.datalinkcard);
        networkCard = (CardView) findViewById(R.id.networkcard);
        transportCard = (CardView) findViewById(R.id.transportcard);
        sessionCard = (CardView) findViewById(R.id.sessioncard);
        presentationCard = (CardView) findViewById(R.id.presentationcard);
        applicationCard = (CardView) findViewById(R.id.applicationcard);

        // Add Click Listener to the cards
        physicalCard.setOnClickListener(this);
        datalinkCard.setOnClickListener(this);
        networkCard.setOnClickListener(this);
        transportCard.setOnClickListener(this);
        sessionCard.setOnClickListener(this);
        presentationCard.setOnClickListener(this);
        applicationCard.setOnClickListener(this);
    }

    @Override
    // OnClick method will be called when a cardview is clicked
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.physicalcard : i = new Intent(this, LessonPhysical.class);
            case R.id.datalinkcard : i = new Intent(this, LessonDatalink.class);
            case R.id.networkcard : i = new Intent(this, LessonNetwork.class);
            case R.id.transportcard : i = new Intent(this, LessonTransport.class);
            case R.id.sessioncard : i = new Intent(this, LessonSession.class);
            case R.id.presentationcard : i = new Intent(this, LessonPresentation.class);
            case R.id.applicationcard : i = new Intent(this, LessonApplication.class);
        }

    }
}

package com.example.esiosi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class OSILayers extends AppCompatActivity implements View.OnClickListener {

    private ImageView physicalImage, datalinkImage, networkImage, transportImage, sessionImage, presentationImage, applicationImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osilayers);

        //Define ImageButtons
        physicalImage = (ImageView) findViewById(R.id.physicalimage);
        datalinkImage = (ImageView) findViewById(R.id.datalinkimage);
        networkImage = (ImageView) findViewById(R.id.networkimage);
        transportImage = (ImageView) findViewById(R.id.transportimage);
        sessionImage = (ImageView) findViewById(R.id.sessionimage);
        presentationImage = (ImageView) findViewById(R.id.presentationimage);
        applicationImage = (ImageView) findViewById(R.id.applicationimage);

        //Add click listener to image views
        physicalImage.setOnClickListener(this);
        datalinkImage.setOnClickListener(this);
        networkImage.setOnClickListener(this);
        transportImage.setOnClickListener(this);
        sessionImage.setOnClickListener(this);
        presentationImage.setOnClickListener(this);
        applicationImage.setOnClickListener(this);

    }

    @Override
    //On click method will be called when a cardview is clicked
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.physicalimage : i = new Intent(this, LessonPhysical.class); startActivity(i); break;
            case R.id.datalinkimage : i = new Intent(this, LessonDatalink.class); startActivity(i); break;
            case R.id.networkimage : i = new Intent(this, LessonNetwork.class); startActivity(i); break;
            case R.id.transportimage : i = new Intent(this, LessonTransport.class); startActivity(i); break;
            case R.id.sessionimage : i = new Intent(this, LessonSession.class); startActivity(i); break;
            case R.id.presentationimage : i = new Intent(this, LessonPresentation.class); startActivity(i); break;
            case R.id.applicationimage : i = new Intent(this, LessonApplication.class); startActivity(i); break;
        }

    }
}


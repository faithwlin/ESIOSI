package com.example.esiosi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class OSILayers extends Navigation implements View.OnClickListener {
    private ImageView physicalImage, datalinkImage, networkImage, transportImage, sessionImage, presentationImage, applicationImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_osilayers, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.layersnav);

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

        //disable buttons
        datalinkImage.setEnabled(false);
        networkImage.setEnabled(false);
        transportImage.setEnabled(false);
        sessionImage.setEnabled(false);
        presentationImage.setEnabled(false);
        applicationImage.setEnabled(false);

    }

    @Override
    //On click method will be called when a cardview is clicked
    //Enables next lesson when previous lesson is clicked
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.physicalimage:
                datalinkImage.setEnabled(true);
                datalinkImage.setImageResource(R.drawable.datalinkcolor2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 1);
                startActivity(i);
                break;

            case R.id.datalinkimage:
                networkImage.setEnabled(true);
                networkImage.setImageResource(R.drawable.networkcolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 2);
                startActivity(i);
                break;

            case R.id.networkimage:
                transportImage.setEnabled(true);
                transportImage.setImageResource(R.drawable.transportcolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 3);
                startActivity(i);
                break;

            case R.id.transportimage:
                sessionImage.setEnabled(true);
                sessionImage.setImageResource(R.drawable.sessioncolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 4);
                startActivity(i);
                break;

            case R.id.sessionimage:
                presentationImage.setEnabled(true);
                presentationImage.setImageResource(R.drawable.presentationcolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 5);
                startActivity(i);
                break;

            case R.id.presentationimage:
                applicationImage.setEnabled(true);
                applicationImage.setImageResource(R.drawable.applicationcolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 6);
                startActivity(i);
                break;

            case R.id.applicationimage:
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 7);
                startActivity(i);
                break;
        }

    }

}
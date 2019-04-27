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

    public static final String SHARED_PREFERENCES = "sharedPreferences";
    public static final String LESSON_KEY = "lessonKey";
    private int lesson;

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

        //Disable buttons
        datalinkImage.setEnabled(false);
        networkImage.setEnabled(false);
        transportImage.setEnabled(false);
        sessionImage.setEnabled(false);
        presentationImage.setEnabled(false);
        applicationImage.setEnabled(false);

        //save state of unlocked and locked buttons via shared preferences
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        int s = preferences.getInt(LESSON_KEY, 0);

        if (s == 2) {
            datalinkImage.setEnabled(true);
            datalinkImage.setImageResource(R.drawable.datalinkcolor2x);
        } else if (s == 3) {
            datalinkImage.setEnabled(true);
            datalinkImage.setImageResource(R.drawable.datalinkcolor2x);
            networkImage.setEnabled(true);
            networkImage.setImageResource(R.drawable.networkcolour2x);
        } else if (s == 4) {
            datalinkImage.setEnabled(true);
            datalinkImage.setImageResource(R.drawable.datalinkcolor2x);
            networkImage.setEnabled(true);
            networkImage.setImageResource(R.drawable.networkcolour2x);
            transportImage.setEnabled(true);
            transportImage.setImageResource(R.drawable.transportcolour2x);
        } else if (s == 5) {
            datalinkImage.setEnabled(true);
            datalinkImage.setImageResource(R.drawable.datalinkcolor2x);
            networkImage.setEnabled(true);
            networkImage.setImageResource(R.drawable.networkcolour2x);
            transportImage.setEnabled(true);
            transportImage.setImageResource(R.drawable.transportcolour2x);
            sessionImage.setEnabled(true);
            sessionImage.setImageResource(R.drawable.sessioncolour2x);
        } else if (s == 6) {
            datalinkImage.setEnabled(true);
            datalinkImage.setImageResource(R.drawable.datalinkcolor2x);
            networkImage.setEnabled(true);
            networkImage.setImageResource(R.drawable.networkcolour2x);
            transportImage.setEnabled(true);
            transportImage.setImageResource(R.drawable.transportcolour2x);
            sessionImage.setEnabled(true);
            sessionImage.setImageResource(R.drawable.sessioncolour2x);
            presentationImage.setEnabled(true);
            presentationImage.setImageResource(R.drawable.presentationcolour2x);

        }

        else if (s == 7) {
            datalinkImage.setEnabled(true);
            datalinkImage.setImageResource(R.drawable.datalinkcolor2x);
            networkImage.setEnabled(true);
            networkImage.setImageResource(R.drawable.networkcolour2x);
            transportImage.setEnabled(true);
            transportImage.setImageResource(R.drawable.transportcolour2x);
            sessionImage.setEnabled(true);
            sessionImage.setImageResource(R.drawable.sessioncolour2x);
            presentationImage.setEnabled(true);
            presentationImage.setImageResource(R.drawable.presentationcolour2x);
            applicationImage.setEnabled(true);
            applicationImage.setImageResource(R.drawable.applicationcolour2x);
        }

    }

    @Override
    //On click method will be called when a cardview is clicked
    //Enables next lesson button when previous lesson button is clicked
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.physicalimage:
                datalinkImage.setEnabled(true);
                datalinkImage.setImageResource(R.drawable.datalinkcolor2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 1);
                startActivity(i);
                updateLesson(2);
                break;

            case R.id.datalinkimage:
                networkImage.setEnabled(true);
                networkImage.setImageResource(R.drawable.networkcolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 2);
                startActivity(i);
                updateLesson(3);
                break;

            case R.id.networkimage:
                transportImage.setEnabled(true);
                transportImage.setImageResource(R.drawable.transportcolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 3);
                startActivity(i);
                updateLesson(4);
                break;

            case R.id.transportimage:
                sessionImage.setEnabled(true);
                sessionImage.setImageResource(R.drawable.sessioncolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 4);
                startActivity(i);
                updateLesson(5);
                break;

            case R.id.sessionimage:
                presentationImage.setEnabled(true);
                presentationImage.setImageResource(R.drawable.presentationcolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 5);
                startActivity(i);
                updateLesson(6);
                break;

            case R.id.presentationimage:
                applicationImage.setEnabled(true);
                applicationImage.setImageResource(R.drawable.applicationcolour2x);
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 6);
                startActivity(i);
                updateLesson(7);
                break;

            case R.id.applicationimage:
                i = new Intent(this, LessonsActivity.class);
                i.putExtra("topic", 7);
                startActivity(i);
                break;
        }

    }

    private void updateLesson(int lessonNEW) {
        lesson = lessonNEW;
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(LESSON_KEY, lesson);
        editor.commit();
    }

}
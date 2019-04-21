package com.example.esiosi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    private ImageView ProfilePic;
    private TextView Name;
    private TextView Email;
    private ImageButton SignOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ProfilePic = findViewById(R.id.profilepic);
        Name = findViewById(R.id.name);
        Email = findViewById(R.id.email);
        SignOut = findViewById(R.id.signout);


    }
}

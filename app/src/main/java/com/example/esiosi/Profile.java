package com.example.esiosi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

import java.io.File;

public class Profile extends Navigation {
    private ImageView ProfilePic;
    private TextView Name;
    private TextView Email;
    private ImageButton SignOut;
    GoogleApiClient mGoogleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Slide in and out animations for activity transition
        overridePendingTransition(R.anim.animation_enter, R.anim.animation_leave);

        // Inflate the layout. Instantiate layout XML file
        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_profile, null, false);
        drawer.addView(contentView, 0);
        navigationView.setCheckedItem(R.id.profilenav);

        //Define objects
        ProfilePic = findViewById(R.id.profilepic);
        Name = findViewById(R.id.name);
        Email = findViewById(R.id.email);
        SignOut = findViewById(R.id.signout);

        //Get user details from Google sign in
        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(getApplicationContext());
        String profileName = acct.getDisplayName();
        String profileEmail = acct.getEmail();
        Uri profilePhoto = acct.getPhotoUrl();

        //set user details into user interface
        Name.setText(profileName);
        Email.setText("You are currently signed in as: " + profileEmail);
        if (profilePhoto != null) {
            Glide.with(this).load(profilePhoto).into(ProfilePic);
        }

        //Specify signout button to signout on click
        SignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(
                        new ResultCallback<Status>() {
                            @Override
                            public void onResult(@NonNull Status status) {
                                Toast.makeText(getApplicationContext(), "Signed Out",Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                                startActivity(i);
                            }
                        }
                );
            }
        });
    }

    @Override
    protected void onStart(){
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        mGoogleApiClient = new GoogleApiClient.Builder(this).addApi(Auth.GOOGLE_SIGN_IN_API, gso).build();
        mGoogleApiClient.connect();
        super.onStart();
    }


}

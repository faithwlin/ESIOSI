package com.example.esiosi;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, GoogleApiClient.OnConnectionFailedListener {
    private ImageButton SignOut;
    private ImageButton SignIn;
    private ImageButton Enter;
    private TextView Name,Email;
    private ImageView logo;

    private GoogleApiClient googleApiClient;
    private static final int REQ_CODE = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        SignOut = (ImageButton)findViewById(R.id.logoutBtn);
        SignIn = (ImageButton)findViewById(R.id.loginBtn);
        Enter = (ImageButton)findViewById(R.id.enterBtn);
        Name = (TextView)findViewById(R.id.name);
        Email = (TextView)findViewById(R.id.email);
        SignIn.setOnClickListener(this);
        SignOut.setOnClickListener(this);
        Enter.setOnClickListener(this);

        Name.setVisibility(View.GONE);
        Email.setVisibility(View.GONE);
        SignOut.setVisibility(View.GONE);
        Enter.setVisibility(View.GONE);

        GoogleSignInOptions signInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        googleApiClient = new GoogleApiClient.Builder(this).enableAutoManage(this, this).addApi(Auth.GOOGLE_SIGN_IN_API,signInOptions).build();
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.loginBtn:
            signIn();
            break;
        case R.id.logoutBtn:
            signOut();
            break;
        case R.id.enterBtn:
            enter();
            break;
    }

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }
    private void enter()
    {

        startActivity(new Intent (LoginActivity.this, MainActivity.class));

    }
    private void signIn()
    {
        Intent intent = Auth.GoogleSignInApi.getSignInIntent(googleApiClient);
        startActivityForResult(intent,REQ_CODE);
    }
    private void signOut()
    {
        Auth.GoogleSignInApi.signOut(googleApiClient).setResultCallback(new ResultCallback<Status>() {
            @Override
            public void onResult(@NonNull Status status) {
                updateUI(false);
            }
        });
    }
    private void handleResult(GoogleSignInResult result) {
        if (result.isSuccess()) {
            GoogleSignInAccount account = result.getSignInAccount();
            String name = account.getDisplayName();
            String email = account.getEmail();


            Name.setText(name);
            Email.setText(email);
            updateUI(true);


        }
        else
        {
            updateUI(false);
        }
    }
    private void updateUI(boolean isLogin)
    {
        if(isLogin)
        {
            Name.setVisibility(View.VISIBLE);
            Email.setVisibility(View.VISIBLE);
            SignOut.setVisibility(View.VISIBLE);
            Enter.setVisibility(View.VISIBLE);
            SignIn.setVisibility(View.GONE);
        }
        else
        {
            Name.setVisibility(View.GONE);
            Email.setVisibility(View.GONE);
            SignOut.setVisibility(View.GONE);
            Enter.setVisibility(View.GONE);
            SignIn.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQ_CODE){
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleResult(result);
        }
    }
}

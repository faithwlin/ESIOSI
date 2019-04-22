package com.example.esiosi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class Flashcards extends AppCompatActivity {

    private CardView arpCard, imcpCard, macCard, tcpCard, udpCard, dhcpCard, dnsCard, httpCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcards);

        arpCard = (CardView) findViewById(R.id.arpcard);


    }
}

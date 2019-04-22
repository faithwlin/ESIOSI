package com.example.esiosi;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Flashcards extends AppCompatActivity {

    CardView arpCard, icmpCard, macCard, tcpCard, udpCard, dhcpCard, dnsCard, httpCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcards);

        arpCard = (CardView) findViewById(R.id.arpcard);
        icmpCard = (CardView) findViewById(R.id.icmpcard);
        macCard = (CardView) findViewById(R.id.maccard);
        tcpCard = (CardView) findViewById(R.id.tcpcard);
        udpCard = (CardView) findViewById(R.id.udpcard);
        dhcpCard = (CardView) findViewById(R.id.dhcpcard);
        dnsCard = (CardView) findViewById(R.id.dnscard);
        httpCard = (CardView) findViewById(R.id.httpcard);

        arpCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                showFlashcardDialog(Flashcards.this, "Address Resolution Protocol", "ARP is is a protocol for mapping an Internet Protocol address (IP address) to a physical machine that is recognised in the local network.", true);
            }
        });
        icmpCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                showFlashcardDialog(Flashcards.this, "Internet Control Message Protocol", "ICMP is an error-reporting protocol network devices like routers use to generate error messages to the source IP address when network problems prevent delivery of IP packets", true);
            }
        });
        macCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                showFlashcardDialog(Flashcards.this, "Media Access Control Address", "MAC address of a device is a unique identifier assigned to a network interface controller (NIC).", true);
            }
        });
        tcpCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                showFlashcardDialog(Flashcards.this, "Transmission Control Protocol", "TCP is a standard that defines how to establish and maintain a network conversation via which application programs can exchange data.", true);
            }
        });
        udpCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                showFlashcardDialog(Flashcards.this, "User Datagram Protocol", "UDP is an alternative communications protocol to Transmission Control Protocol (TCO) used primarily for establishing low-latency and loss-tolerating connections between applications on the Internet.", true);
            }
        });
        dhcpCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                showFlashcardDialog(Flashcards.this, "Dynamic Host Configuration Protocol", "DHCP is a network management protocol used to dynamically assign an Internet Protocol (IP) address to any device, or node, on a network so they can communicate using IP.", true);
            }
        });
        dnsCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                showFlashcardDialog(Flashcards.this, "Domain Name System", "DNS is a hierarchical and decentralised naming system for computers, services, or other resources conntected to the Internet or a private network.", true);
            }
        });
        httpCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                showFlashcardDialog(Flashcards.this, "Hypertext Transfer Protocol", "HTTP is an application-layer protocol used primarily on the World Wide Web. HTTP uses a client-server model where the web browser is the client and communicates with the webserver that hosts the website.", true);
            }
        });

    }

    public void showFlashcardDialog(Context context, String title, String message, Boolean status) {
        AlertDialog flashcardDialog = new AlertDialog.Builder(context).create();

        //Setting Dialog Title
        flashcardDialog.setTitle(title);

        flashcardDialog.setCancelable(true);

        //Setting Dialog Message
        flashcardDialog.setMessage(message);

        flashcardDialog.show();
    }
}

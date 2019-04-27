package com.example.esiosi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import org.w3c.dom.Text;

public class LessonsActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {


    static final String GOOGLE_API_KEY = "AIzaSyAoACxRsjrQ1gX5V5hwFHNlnsGYSCfNYms";
    static final String YOUTUBE_VIDEO_ID1 = "MQUi9NMMO5Y";
    static final String YOUTUBE_VIDEO_ID2 = "pi7mMjiixiY";
    static final String YOUTUBE_VIDEO_ID3 = "iG-e-pjIIM4";
    static final String YOUTUBE_VIDEO_ID4 = "qSk5SLrg7Yg";
    static final String YOUTUBE_VIDEO_ID5 = "AtITX-U2mL4";
    static final String YOUTUBE_VIDEO_ID6 = "2Abjxmp7TfU";
    static final String YOUTUBE_VIDEO_ID7 = "kAty4mKczEg";

    Toolbar toolbar;
    TextView introduction;
    TextView content;

    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        //Define the TextViews
        introduction = (TextView) findViewById(R.id.introduction);
        content = (TextView) findViewById(R.id.content);

        //Define YouTubePlayerView
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);

        Bundle bundle = getIntent().getExtras();
        int i = bundle.getInt("topic");

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LessonsActivity.this.onBackPressed();
            }
        });
        //Set data values
        if (i == 1) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar.setTitle("Physical Layer");
            introduction.setText("Introduction to the Physical Layer");
            content.setText("The physical layer is the first layer of the Open System Interconnection Model (OSI Model). The physical layer deals with bit-level transmission between different devices and supports electrical or mechanical interfaces connecting to the physical medium for synchronized communication. \n" +
                    "\n" +
                    "This layer plays with most of the network’s physical connections - wireless transmission, cabling, cabling standards and types, connectors and types, network interface cards, and more - as per network requirements. However, the physical layer does not deal with the actual physical medium (like copper, fiber). The physical layer is aimed at consolidating the hardware requirements of a network to enable the successful transmission of data. Network engineers can define different bit-transmission mechanisms for the physical layer level, including the shapes and types of connectors, cables, and frequencies for each physical medium. \n" +
                    "\n" +
                    "The physical layer sometimes plays an important role in the effective sharing of available communication resources, and helps avoid contention among multiple users. It also handles the transmission rate to improve the flow of data between a sender and receiver.\n" +
                    "\n");
        //Set data values
        } else if (i == 2) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar.setTitle("Data Link Layer");
            introduction.setText("Introduction to the Data Link Layer");
            content.setText("The data link layer is the protocol layer in a program that handles the moving of data into and out of a physical link in a network. The data link layer is Layer 2 in the Open Systems Interconnection (OSI) architecture model for a set of telecommunication protocols. Data bits are encoded, decoded and organized in the data link layer, before they are transported as frames between two adjacent nodes on the same LAN or WAN. The data link layer also determines how devices recover from collisions that may occur when nodes attempt to send frames at the same time. \n" +
                    "\n" +
                    "The data link layer has two sublayers: the logical link control (LLC) sublayer and the media access control (MAC) sublayer. \n" +
                    "\n" +
                    "As described by the IEEE-802 LAN specification, the role of the LLC sublayer is to control data flow among various applications and services, as well as provide acknowledgement and error notification mechanisms. The LLC sublayer can then talk to a number of IEEE 802 MAC sublayers, which control access to the physical media for transport. It is also responsible for the physical addressing of frames. Two common MAC layer types include Ethernet and 802.11 wireless specifications. \n" +
                    "\n");
        //Set data values
        } else if (i == 3) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar.setTitle("Network Layer");
            introduction.setText("Introduction to the Network Layer");
            content.setText("The network layer is the third level of the Open Systems Interconnection Model (OSI Model) and the layer that provides data routing paths for network communication. Data is transferred in the form of packets via logical network paths in an ordered format controlled by the network layer. Logical connection setup, data forwarding, routing and delivery error reporting are the network layer’s primary responsibilities.\n" +
                    "\n" +
                    "The network layer is considered the backbone of the OSI Model. It selects and manages the best logical path for data transfer between nodes. This layer contains hardware devices such as routers, bridges, firewalls and switches, but it actually creates a logical image of the most efficient communication route and implements it with a physical medium. \n" +
                    "\n" +
                    "Network layer protocols exist in every host or router. The router examines the header fields of all the IP packets that pass through it. Internet Protocol and Netware IPX/SPX are the most common protocols associated with the network layer. In the OSI model, the network layer responds to requests from the layer above it (transport layer) and issues requests to the layer below it (data link layer). \n" +
                    "\n");
        //Set data values
        } else if (i == 4) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar.setTitle("Transport Layer");
            introduction.setText("Introduction to the Transport Layer");
            content.setText("In the OSI model, the transport layer is the fourth layer of this network structure. The transport layer is the layer in the open system interconnection (OSI) model responsible for end-to-end communication over a network. It provides logical communication between application processes running on different hosts within a layered architecture of protocols and other network components. \n" +
                    "\n" +
                    "The transport layer is also responsible for the management of error correction, providing quality and reliability to the end user. This layer enables the host to send and receive error corrected data, packets or messages over a network and is the network component that allows multiplexing. \n" +
                    "\n" +
                    "Transport layers work transparently within the layers above to deliver and receive data without errors. The send side breaks application messages into segments and passes them on to the network layer. The receiving side then reassembles segments into messages and passes them to the application layer. \n" +
                    "\n");
        //Set data values
        } else if (i == 5) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar.setTitle("Session Layer");
            introduction.setText("Introduction to the Session Layer");
            content.setText("In the Open Systems Interconnection (OSI) model, the session layer is the fifth layer, which controls the connections between multiple computers. The session layer tracks the dialogs between computers, which are also called sessions. This layer establishes, controls and ends the sessions between local and remote applications. \n" +
                    "\n" +
                    "The session layer manages a session by initiating the opening and closing of sessions between end-user application processes. This layer also controls single or multiple connections for each end-user application, and directly communicates with both the presentation and the transport layers. The services offered by the session layer are generally implemented in application environments using remote procedure calls (RPCs). \n" +
                    "\n" +
                    "Sessions are most commonly implemented on Web browsers using protocols such as the Zone Information Protocol, the AppleTalk Protocol and the Session Control Protocol. These protocols also manage session restoration through checkpointing and recovery.  \n" +
                    "\n" +
                    "The session layer supports full-duplex and half-duplex operations and creates procedures for checkpointing, adjournment, restart and termination. The session layer is also responsible for synchronizing information from different sources. For example, sessions are implemented in live television programs in which the audio and video streams emerging from two different sources are merged together. This avoids overlapping and silent broadcast time. \n" +
                    "\n");
        //Set data values
        } else if (i == 6) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar.setTitle("Presentation Layer");
            introduction.setText("Introduction to the Presentation Layer");
            content.setText("The presentation layer is layer 6 of the 7-layer Open Systems Interconnection (OSI) model. It is used to present data to the application layer (layer 7) in an accurate, well-defined and standardized format. The presentation layer is sometimes called the syntax layer. \n" +
                    "\n" +
                    "The presentation layer mainly translates data between the application layer and the network format. Data can be communicated in different formats via different sources. Thus, the presentation layer is responsible for integrating all formats into a standard format for efficient and effective communication. \n" +
                    "\n" +
                    "The presentation layer follows data programming structure schemes developed for different languages and provides the real-time syntax required for communication between two objects such as layers, systems or networks. The data format should be acceptable by the next layers; otherwise, the presentation layer may not perform correctly. Network devices or components used by the presentation layer include redirectors and gateways. \n" +
                    "\n");
        //Set data values
        } else if (i == 7) {
            youTubePlayerView.initialize(GOOGLE_API_KEY, this);
            toolbar.setTitle("Application Layer");
            introduction.setText("Introduction to the Application Layer");
            content.setText("The application layer is a layer in the Open Systems Interconnection (OSI) seven-layer model and in the TCP/IP protocol suite. It consists of protocols that focus on process-to-process communication across an IP network and provides a firm communication interface and end-user services. \n" +
                    "\n" +
                    "The application layer is the seventh layer of the OSI model and the only one that directly interacts with the end user. The application layer provides full end-user access to a variety of shared network services for efficient OSI model data flow. This layer has many responsibilities, including error handling and recovery, data flow over a network and full network flow. It is also used to develop network-based applications. \n" +
                    "\n" +
                    "More than 15 protocols are used in the application layer, including File Transfer Protocol, Telnet, Trivial File Transfer Protocol and Simple Network Management Protocol. Its major network device or component is the gateway. \n" +
                    "\n");
        }


    }


    //Method which initalises Youtube Player with relevant Youtube video based on Toolbar Title
    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if (toolbar.getTitle().toString().equalsIgnoreCase("Application Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID1);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Data Link Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID2);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Network Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID3);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Physical Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID4);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Presentation Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID5);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Session Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID6);
        } else if (toolbar.getTitle().toString().equalsIgnoreCase("Transport Layer")) {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID7);
        }

    }

    //Show error code if API initialisation fails
    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        final int REQUEST_CODE = 1;

        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, REQUEST_CODE).show();
        }
    }

}


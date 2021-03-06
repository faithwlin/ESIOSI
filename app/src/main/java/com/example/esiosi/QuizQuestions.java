package com.example.esiosi;

public class QuizQuestions {
    //Store Question Numbers
    private String mQuestionNo[]={
            "Question 1",
            "Question 2",
            "Question 3",
            "Question 4",
            "Question 5",
            "Question 6",
            "Question 7",
            "Question 8",
            "Question 9",
            "Question 10",

    };
    //Store Questions
    private String mQuestions[] = {
            // Easy? Should we do 2 types of difficulties
            "The physical layer is concerned with what delivery?",
            "The physical layer provides ______.",
            "Which of the following is not a function of the network layer?",
            "ICMP is primarily used for ______.",
            "The transport layer aggregates data from different applications into a single stream before passing it to ______.",
            "Which of the following is a transport layer protocol used in internet?",
            "User datagram protocol is connectionless because ______.",
            "Transmission control protocol ______.",
            "To deliver a message to the application program running on a host, a ______ address is consulted",
            "Electronic mail uses which application layer protocol?",
            // Hard?
            "Q1/10: Question 1 Question 1 Question 1 Question 1 Question 1 Question 1",
            "Q2/10: Question 2 Question 2 Question 2 Question 2 Question 2 Question 2",
            "Q3/10: Question 3 Question 3 Question 3 Question 3 Question 3 Question 3",
            "Q4/10: Question 4 Question 4 Question 4 Question 4 Question 4 Question 4",
            "Q5/10: Question 5 Question 5 Question 5 Question 5 Question 5 Question 5",
            "Q6/10: Question 6 Question 6 Question 6 Question 6 Question 6 Question 6",
            "Q7/10: Question 7 Question 7 Question 7 Question 7 Question 7 Question 7",
            "Q8/10: Question 8 Question 8 Question 8 Question 8 Question 8 Question 8",
            "Q9/10: Question 9 Question 9 Question 9 Question 9 Question 9 Question 9",
            "10/10: Question 10 Question 10 Question 10 Question 10 Question 10 Question 10",

    };
    //Store Hints
    private String mHints[] = {
            "The physical layer defines the means of transmitting raw bits.",
            "The physical layer deals with most of the network's physical connections.",
            "The network layer provides data routing paths for network communication.",
            "One function of ICMP is sending messages indicating a requested service is not available.",
            "Try to remember the OSI acronym.",
            "UDP is primarily used for establishing low-latency and loss-tolerating connections between applications.",
            "Connectionless protocols are usually described a stateless because the endpoints have no protocol-defined way to remember where they are in a 'conversation' of messages",
            "TCP is one of the main protocols of the Internet Protocol suite",
            "Just guess.",
            "Re-watch application layer lesson.",

    };
    //Store Multiple Choice options
    private String mChoices [][] = {
            // Easy?
            {"bit-by-bit delivery", "process to process delivery", "application to application delivery", "none of the above"},
            {"mechanical specifications of electrical connectors and cables", "electrical specification of transmission line signal level", "specification for IR over optical fiber", "all of the above"},
            {"routing", "congestion control", "networking", "none of the above"},
            {"error and diagnostics", "addressing", "forwarding", "replying"},
            {"the network layer", "the application layer", "the data link layer", "the physical layer"},
            {"TCP", "UDP", "both TCP & UDP", "none of the above"},
            {"all UDP packets are treated independently by the transport layer", "it sends data as a stream of packets", "both A & B", "none of the above"},
            {"is a connection oriented protocol", "uses a 3 way handshake to establish connection", "receives data from application", "all of the above"},
            {"IP", "port", "MAC", "none of the above"},
            {"SMTP", "HTTP", "FTP", "SIP"},
            // Hard version?
            {"Answer 11", "Option 2", "Option 3", "Option 4"},
            {"Option 1", "Answer 12", "Option 3", "Option 4"},
            {"Option 1", "Option 2", "Answer 13", "Option 4"},
            {"Option 1", "Option 2", "Option 3", "Answer 14"},
            {"Answer 15", "Option 2", "Option 3", "Option 4"},
            {"Option 1", "Answer 16", "Option 3", "Option 4"},
            {"Option 1", "Option 2", "Answer 17", "Option 4"},
            {"Option 1", "Option 2", "Option 3", "Answer 18"},
            {"Answer 19", "Option 2", "Option 3", "Option 4"},
            {"Option 1", "Answer20 2", "Option 3", "Option 4"},


    };

    //Store correct answers
    private String mCorrectAnswers[] = {"bit-by-bit delivery", "all of the above", "none of the above", "error and diagnostics", "the network layer", "both TCP & UDP", "all UDP packets are treated independently by the transport layer", "all of the above", "port", "SMTP", "Answer 11", "Answer 12", "Answer 13", "Answer 14", "Answer 15", "Answer 16", "Answer 17", "Answer 18", "Answer 19", "Answer 20" };

    //Getters
    public String getQuestionNo(int a){
        String questionNo = mQuestionNo[a];
        return questionNo;
    }

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

    public String getHint(int a) {
        String hint = mHints[a];
        return hint;
    }

}

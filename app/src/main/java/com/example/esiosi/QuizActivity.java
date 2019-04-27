package com.example.esiosi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class QuizActivity extends AppCompatActivity {

    private QuizQuestions quizQuestions = new QuizQuestions();
    private TextView timer;
    private TextView QuestionNo;
    private TextView Question;
    private Button Answer1;
    private Button Answer2;
    private Button Answer3;
    private Button Answer4;
    private String correctAnswer;
    private int attempts = 0;
    public int mScore = 0;
    private int questionNumber = 0;
    private ImageView button;
    private int highScore;
    public static final String SHARED_PREFERENCES = "sharedPreferences";
    public static final String HIGHSCORE_KEY = "highScoreKey";
    public static final String SCORE_KEY = "score";
    public static final String TRANSFER_SCORE = "transferScore";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_start);

        //Define timer
        timer = findViewById(R.id.timer);

        //Set countdown timer for 10 minutes, format changed to Minutes and Seconds
        new CountDownTimer(600000, 1000) {
            public void onTick(long millisUntilFinished) {
                timer.setText("" + String.format("0%d : %d",
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                timer.setText("done!");
            }
        }.start();

        //Initialise variables
        QuestionNo = findViewById(R.id.QuestionNo);
        Question = findViewById(R.id.Question);
        Answer1 = findViewById(R.id.Answer1);
        Answer2 = findViewById(R.id.Answer2);
        Answer3 = findViewById(R.id.Answer3);
        Answer4 = findViewById(R.id.Answer4);
        mScore = 0;
        button = (ImageView) findViewById(R.id.button);

        updateQuestion();

        //Set CLickListener for each answer and display whether
        // the answer is correct or incorrect
        Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attempts++;
                if (Answer1.getText() == correctAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attempts++;
                if (Answer2.getText() == correctAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attempts++;
                if (Answer3.getText() == correctAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attempts++;
                if (Answer4.getText() == correctAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

    }

    //Method that allows questions and options to be changed
    private void updateQuestion() {


        if (attempts < 10) { //To ensure only 10 questions are shown.
            Question.setText(quizQuestions.getQuestion(questionNumber));
            Answer1.setText(quizQuestions.getChoice1(questionNumber));
            Answer2.setText(quizQuestions.getChoice2(questionNumber));
            Answer3.setText(quizQuestions.getChoice3(questionNumber));
            Answer4.setText(quizQuestions.getChoice4(questionNumber));
            QuestionNo.setText(quizQuestions.getQuestionNo(questionNumber));
        }

        //OnClickListener for the Hints button to show AlertDialog
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showHintDialog(QuizActivity.this, quizQuestions.getHint(questionNumber - 1), true);

            }
        });

        //Checks with QuizQuestions class to see if answer was correct
        correctAnswer = quizQuestions.getCorrectAnswer(questionNumber);

        //Finishes the quiz once 10 questions have been answered
        if (attempts == 10) {
            finish();
            updateScore(mScore);
            Intent results = new Intent(getApplicationContext(), QuizComplete.class); //Starts QuizComplete activity
            results.putExtra(TRANSFER_SCORE, mScore); //Transfers score to show at QuizComplete activity
            startActivity(results);

        } else {
            questionNumber++;
        }

        if (mScore > highScore) {
            updateHighScore(mScore);
        }
    }


    //Method to store the score as the user conducts quiz
    private void updateScore(int point) {
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(SCORE_KEY, mScore);

    }
    //Displaying the hint function with an AlertDialog
    public void showHintDialog(Context context, String message, Boolean status) {
        AlertDialog.Builder hintDialog = new AlertDialog.Builder(this, R.style.AppCompatAlertDialogStyle);


        hintDialog.setCancelable(true);
        //Set AlertDialog message
        hintDialog.setMessage(message);

        hintDialog.show();
    }

    //Method to update and store new highScore
    private void updateHighScore(int newHighScore) {
        highScore = newHighScore;
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(HIGHSCORE_KEY, highScore);
        editor.commit();

    }




}

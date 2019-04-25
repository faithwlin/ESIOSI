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
    public static final String TRANSFER_SCORE = "transferScore";
    private TextView timer;
    private int questionNumber = 0;
    private TextView QuestionNo;
    private TextView Question;
    private Button Answer1;
    private Button Answer2;
    private Button Answer3;
    private Button Answer4;
    private String correctAnswer;
    private int attempts = 0;
    public int mScore = 0;
    QuizDatabase quizDatabase;
    private ImageView button;
    private int highScore;
    public static final String SHARED_PREFERENCES = "sharedPreferences";
    public static final String HIGHSCORE_KEY = "highScoreKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_start);

        timer = findViewById(R.id.timer);

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

        QuestionNo = findViewById(R.id.QuestionNo);
        Question = findViewById(R.id.Question);
        Answer1 = findViewById(R.id.Answer1);
        Answer2 = findViewById(R.id.Answer2);
        Answer3 = findViewById(R.id.Answer3);
        Answer4 = findViewById(R.id.Answer4);
        mScore = 0;
        button = (ImageView) findViewById(R.id.button);


        quizDatabase = new QuizDatabase(this);

        updateQuestion();

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

    private void updateQuestion() {

        if (attempts < 10) {
            Question.setText(quizQuestions.getQuestion(questionNumber));
            Answer1.setText(quizQuestions.getChoice1(questionNumber));
            Answer2.setText(quizQuestions.getChoice2(questionNumber));
            Answer3.setText(quizQuestions.getChoice3(questionNumber));
            Answer4.setText(quizQuestions.getChoice4(questionNumber));
            QuestionNo.setText(quizQuestions.getQuestionNo(questionNumber));
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String s = quizQuestions.getHint(questionNumber - 1);
                showFlashcardDialog(QuizActivity.this, quizQuestions.getHint(questionNumber - 1), true);

            }
        });

        correctAnswer = quizQuestions.getCorrectAnswer(questionNumber);

        if (attempts == 10) {
            finish();
            int score = mScore;
            quizDatabase.addData(score);
            Intent results = new Intent(getApplicationContext(),QuizComplete.class);
            results.putExtra(TRANSFER_SCORE, score);
            startActivity(results);
        }
        else {
            questionNumber++;
        }

        if (mScore > highScore) {
            updateHighScore(mScore);
        }
    }


    private void updateScore(int point) {
    }

    public void showFlashcardDialog(Context context, String message, Boolean status) {
        AlertDialog.Builder flashcardDialog = new AlertDialog.Builder(this, R.style.AppCompatAlertDialogStyle);


        flashcardDialog.setCancelable(true);
        flashcardDialog.setMessage(message);
        flashcardDialog.show();
    }

    private void updateHighScore(int newHighScore) {
        highScore = newHighScore;


        SharedPreferences preferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(HIGHSCORE_KEY, highScore);
        editor.commit();

    }


}

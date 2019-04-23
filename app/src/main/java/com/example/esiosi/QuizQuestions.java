package com.example.esiosi;

public class QuizQuestions {

    private String mQuestions[] = {
            // Easy? Should we do 2 types of difficulties
            "Q1/10, Question 1 Question 1 Question 1 Question 1 Question 1 Question 1",
            "Q2/10, Question 2 Question 2 Question 2 Question 2 Question 2 Question 2",
            "Q3/10, Question 3 Question 3 Question 3 Question 3 Question 3 Question 3",
            "Q4/10, Question 4 Question 4 Question 4 Question 4 Question 4 Question 4",
            "Q5/10, Question 5 Question 5 Question 5 Question 5 Question 5 Question 5",
            "Q6/10, Question 6 Question 6 Question 6 Question 6 Question 6 Question 6",
            "Q7/10, Question 7 Question 7 Question 7 Question 7 Question 7 Question 7",
            "Q8/10, Question 8 Question 8 Question 8 Question 8 Question 8 Question 8",
            "Q9/10, Question 9 Question 9 Question 9 Question 9 Question 9 Question 9",
            "10/10, Question 10 Question 10 Question 10 Question 10 Question 10 Question 10",
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

    private String mHints[] = {
            "Hint 1",
            "Hint 2",
            "Hint 3",
            "Hint 4",
            "Hint 5",
            "Hint 6",
            "Hint 7",
            "Hint 8",
            "Hint 9",
            "Hint 10",

    };

    private String mChoices [][] = {
            // Easy?
            {"Answer 1", "Option 2", "Option 3", "Option 4"},
            {"Option 1", "Answer 2", "Option 3", "Option 4"},
            {"Option 1", "Option 2", "Answer 3", "Option 4"},
            {"Option 1", "Option 2", "Option 3", "Answer 4"},
            {"Answer 5", "Option 2", "Option 3", "Option 4"},
            {"Option 1", "Answer 6", "Option 3", "Option 4"},
            {"Option 1", "Option 2", "Answer 7", "Option 4"},
            {"Option 1", "Option 2", "Option 3", "Answer 8"},
            {"Answer 9", "Option 2", "Option 3", "Option 4"},
            {"Option 1", "Answer 10", "Option 3", "Option 4"},
            // Hard?
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

    private String mCorrectAnswers[] = {"Answer 1", "Answer 2", "Answer 3", "Answer 4", "Answer 5", "Answer 6", "Answer 7", "Answer 8", "Answer 9", "Answer 10", "Answer 11", "Answer 12", "Answer 13", "Answer 14", "Answer 15", "Answer 16", "Answer 17", "Answer 18", "Answer 19", "Answer 20" };


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

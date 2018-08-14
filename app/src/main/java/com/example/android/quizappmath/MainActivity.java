package com.example.android.quizappmath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //question 1 and question 2
    RadioGroup radioGroup,
            radioGroup2;
    //question 1 and 2 radiobutton
    RadioButton answer1,
            rb1,
            rb3,
            answer2;
    //question 3
    CheckBox cb1,
            cb2,
            cb3,
            cb4;
    //question 4
    EditText editText;
    //submit button
    Button submitAnswers;
    Toast scoreTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {

        TextView textView = findViewById(R.id.scoreTotal);
        int firstAnswer_score;
        int secondAnswer_score;
        int thirdAnswer_score;
        int fourthAnswer_score;
        int scoreTotal;

        // Question 1
        boolean firstAnswer;
        firstAnswer = rb1.isChecked();
        if (firstAnswer) {
            firstAnswer_score = 1;
        } else {
            firstAnswer_score = 0;
        }
        // Question 2
        boolean secondAnswer;
        secondAnswer = rb3.isChecked();
        if (secondAnswer) {
            secondAnswer_score = 1;
        } else {
            secondAnswer_score = 0;
        }

        //Question 3

        Boolean thirdAnswer_check1, thirdAnswer_check2, thirdAnswer_check3, thirdAnswer_check4;
        thirdAnswer_check1 = cb1.isChecked();
        thirdAnswer_check2 = cb2.isChecked();
        thirdAnswer_check3 = cb3.isChecked();
        thirdAnswer_check4 = cb4.isChecked();

        if (!thirdAnswer_check1.isChecked()
                && thirdAnswer_check2.isChecked()
                && !thirdAnswer_check3.isChecked()
                && thirdAnswer_check4.isChecked()) {
            thirdAnswer_score = 1;
        } else {
            thirdAnswer_score = 0;
        }

    }// Question 4

    {
        EditText editText = (EditText) findViewById(R.id.editText);

        String fourthAnswer = editText.getText().toString();
        String answer = "";
        boolean isAnswerTrue = answer.equals(fourthAnswer);
    }
}
// Toast Message Displaying Results

    scoreTotal=firstAnswer_score+secondAnswer_score+thirdAnswer_score+fourthAnswer_score;
            if(scoreTotal = 4){
            display="Good job, you got them all right!";
            }else{
            display="Oops try again"}

            TextView.setText("Your score: " + scoreTotal);
            }

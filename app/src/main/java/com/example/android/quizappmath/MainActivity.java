package com.example.android.quizappmath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

        Button display = findViewById(R.id.scoreTotal);
        int scoreTotal = 0, firstAnswer_score, secondAnswer_score, thirdAnswer_score, fourthAnswer_score;

        // Question 1
        Boolean firstAnswer;
        firstAnswer = rb1.isChecked();
        if (firstAnswer) {
            firstAnswer_score = 1;
        }
        // Question 2
        boolean secondAnswer;
        secondAnswer = rb3.isChecked();
        if (secondAnswer) {
            secondAnswer_score = 1;
        }

        //Question 3
        CheckBox thirdAnswer_check2 = findViewById(R.id.cb2);
        CheckBox thirdAnswer_check4 = findViewById(R.id.cb4);

        thirdAnswer_check2.isChecked();
        thirdAnswer_check4.isChecked();

        if (thirdAnswer_check2.isChecked()
                && thirdAnswer_check4.isChecked()) {
            thirdAnswer_score = 1;
        }

    }// Question 4

    {
        EditText editText = (EditText) findViewById(R.id.editText);

        String fourthAnswer = editText.getText().toString();
        String answer = "22";
    }
}
// Toast Message Displaying Results
    scoreTotal=firstAnswer_score+secondAnswer_score+thirdAnswer_score+fourthAnswer_score;
            {
            if(scoreTotal=4){
            display="Good job, you got them all right!";
            }else{
            display="Oops try again";
            }
            Toast toast=Toast.makeText(getApplicationContext(),display,Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
            }


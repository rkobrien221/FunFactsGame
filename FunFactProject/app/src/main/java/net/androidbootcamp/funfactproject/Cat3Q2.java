package net.androidbootcamp.funfactproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Cat3Q2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat3_q2);

        final RadioGroup answers = (RadioGroup)findViewById(R.id.grpAnswers);
        final RadioButton ansOne = (RadioButton)findViewById(R.id.ansOne);
        final RadioButton ansTwo = (RadioButton)findViewById(R.id.ansTwo);
        final RadioButton ansThree = (RadioButton)findViewById(R.id.ansThree);
        Button btnCheck = (Button)findViewById(R.id.btnCheck);
        Button btnBack = (Button)findViewById(R.id.btnBack);
        Button btnNext = (Button)findViewById(R.id.btnNext);


        btnCheck.setOnClickListener(new View.OnClickListener() {
            final TextView result = (TextView)findViewById(R.id.txtResult);
            /*Checks answer and displays correct answer*/
            @Override
            public void onClick(View v) {
                if(ansOne.isChecked()){
                    result.setText("Wrong! You must beat him fast without getting hit.");
                }
                else if(ansTwo.isChecked()){
                    result.setText("Wrong! You must beat him fast without getting hit.");
                }
                else if(ansThree.isChecked()){
                    result.setText("Correct! Good Job!");
                }

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            //Buttons returns to home screen
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cat3Q2.this, Cat3Q1.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            //Button moves to next question
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cat3Q2.this, Cat3Q3.class));
            }
        });
    }

}

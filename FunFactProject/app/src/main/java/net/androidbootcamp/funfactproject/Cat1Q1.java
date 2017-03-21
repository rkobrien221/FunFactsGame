package net.androidbootcamp.funfactproject;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Cat1Q1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat1_q1);

        final RadioGroup answers = (RadioGroup)findViewById(R.id.grpAnswers);
        final RadioButton ansOne = (RadioButton)findViewById(R.id.ansOne);
        final RadioButton ansTwo = (RadioButton)findViewById(R.id.ansTwo);
        final RadioButton ansThree = (RadioButton)findViewById(R.id.ansThree);
        Button btnCheck = (Button)findViewById(R.id.btnCheck);
        Button btnHome = (Button)findViewById(R.id.btnHome);
        Button btnNext = (Button)findViewById(R.id.btnNext);


        btnCheck.setOnClickListener(new View.OnClickListener() {
            final TextView result = (TextView)findViewById(R.id.txtResult);
            /*Checks answer and displays correct answer*/
            @Override
            public void onClick(View v) {
                if(ansOne.isChecked()){
                    result.setText("Wrong! This is a prototype for the Gameboy");
                }
                else if(ansTwo.isChecked()){
                    result.setText("Correct! Good Job");
                }
                else if(ansThree.isChecked()){
                    result.setText("Wrong! This is a prototype for the Gameboy");
                }

            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            //Buttons returns to home screen
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cat1Q1.this, MainActivity.class));
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            //Button moves to next question
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cat1Q1.this, Cat1Q2.class));
            }
        });
    }

}

package net.androidbootcamp.funfactproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnCatOne = (ImageButton)findViewById(R.id.btnCatOne);
        btnCatOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Cat1Q1.class));
            }
        });

        ImageButton btnCatTwo = (ImageButton)findViewById(R.id.btnCatTwo);
        btnCatTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Cat2Q1.class));
            }
        });

        ImageButton btnCatThree = (ImageButton)findViewById(R.id.btnCatThree);
        btnCatThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Cat3Q1.class));
            }
        });
    }
}

package com.something.muhmmadtauqeer.puzzlegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
   Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button = (Button)findViewById(R.id.start1);
        button1 = (Button)findViewById(R.id.start2);
        button2 = (Button)findViewById(R.id.start3);
        button3 = (Button)findViewById(R.id.start4);
        button4 = (Button)findViewById(R.id.start5);
        button5 = (Button)findViewById(R.id.start6);
        button6 = (Button)findViewById(R.id.start7);
        button7 = (Button)findViewById(R.id.start8);


        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });
        // Capture button1 clicks
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(StartActivity.this,SecondGame.class);
                startActivity(myIntent);
            }
        });

        // Capture button2 clicks
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });

        // Capture button3 clicks
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });



        // Capture button4 clicks
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });



        // Capture button5 clicks
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });



        // Capture button6 clicks
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });



        // Capture button7 clicks
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(StartActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });




    }


}

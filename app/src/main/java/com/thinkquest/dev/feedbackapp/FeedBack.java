package com.thinkquest.dev.feedbackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FeedBack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        //

        Intent intent = getIntent();

        String message = intent.getStringExtra("USERNAME");
        TextView textView=findViewById(R.id.txt_unm);
        textView.setText("Welcome "+message + "!!!!");
    }
}

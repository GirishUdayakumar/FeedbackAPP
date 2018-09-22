package com.thinkquest.dev.feedbackapp;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.icu.text.RelativeDateTimeFormatter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //

        TextView output =findViewById(R.id.txt_output);
        output.setVisibility(View.INVISIBLE);
    }

    public void Login(View view)
    {
        EditText editText_usr =findViewById(R.id.txt_unm);
        String username=editText_usr.getText().toString();

        EditText editText_pass=findViewById(R.id.txt_pass);
        String passwd =editText_pass.getText().toString();

        if(username.equals(passwd))
        {
            Intent intent = new Intent(this,FeedBack.class);
            intent.putExtra("USERNAME",username);
            startActivity(intent);
        }
        else
        {
            TextView output =findViewById(R.id.txt_output);
            output.setVisibility(View.VISIBLE);
            output.setText("Incorrect Login!!! Please try again...");

        }

    }
}

package com.thinkquest.dev.feedbackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
         AppCenter.start(getApplication(), "9e6defde-c05b-4dfc-89c5-368a24a576f7", Analytics.class, Crashes.class);

        //
        myDB= new DatabaseHelper(this);
    }

    public void login(View view)
    {
        Intent intent = new Intent(this,Login.class);
                startActivity(intent);
    }

    public void registration(View view)
    {
        Intent intent =new Intent(this,Registration.class);
            startActivity(intent);
    }
}

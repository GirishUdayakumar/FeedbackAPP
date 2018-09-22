package com.thinkquest.dev.feedbackapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Registration extends AppCompatActivity
{
    private Button btnreg;
    private TextView tunm,tfnm,tlnm,tpass,trpass,temail,tmno;


    private String unm,fnm,lnm,pass,rpass,email,mno;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


    }

    public void reset()
    {
        View view= new View(this);

        tunm=view.findViewById(R.id.txt_unm);
        tfnm=view.findViewById(R.id.txt_fnm);
        tlnm=view.findViewById(R.id.txt_lnm);
        tpass=view.findViewById(R.id.txt_pass);
        trpass=view.findViewById(R.id.txt_repass);
        temail=view.findViewById(R.id.txt_email);
        tmno=view.findViewById(R.id.txt_mno);

        tunm.setText("");
        tfnm.setText("");
        tlnm.setText("");
        tpass.setText("");
        trpass.setText("");
        temail.setText("");
        tmno.setText("");

    }


    public void Register(View view)
    {
        btnreg=view.findViewById(R.id.btn_reg);
        tunm=view.findViewById(R.id.txt_unm);
        tfnm=view.findViewById(R.id.txt_fnm);
        tlnm=view.findViewById(R.id.txt_lnm);
        tpass=view.findViewById(R.id.txt_pass);
        trpass=view.findViewById(R.id.txt_repass);
        temail=view.findViewById(R.id.txt_email);
        tmno=view.findViewById(R.id.txt_mno);

        unm=tunm.getText().toString();
        fnm=tfnm.getText().toString();
        lnm=tlnm.getText().toString();
        pass=tpass.getText().toString();
        rpass=trpass.getText().toString();
        email=temail.getText().toString();
        mno=tmno.getText().toString();

        //
        try
        {
            DatabaseHelper databaseHelper = new DatabaseHelper(this);

            SQLiteDatabase sqLiteDatabase;

            if(pass.equals(rpass))
            {
                sqLiteDatabase = databaseHelper.getWritableDatabase();
                databaseHelper.addDetails(unm,fnm,lnm,pass,email,mno,sqLiteDatabase);
                databaseHelper.close();


                reset();
                Toast.makeText(this,"Data Saved successfully",Toast.LENGTH_SHORT).show();




            }

            else
            {
                //
                Toast.makeText(this,"Password not matching",Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e)
        {

        }



    }
}

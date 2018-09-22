package com.thinkquest.dev.feedbackapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper
{

    public static final String DATABASE_NAME="Feedbackapp.db";

    public static final String TABLE_NAME="Student";

    public static final String col1_uid="UserID";
    public static final String col2_fname="First_Name";
    public static final String col3_lname="Last_Name";
    public static final String col4_passwd="Password";
    public static final String col5_email="Email";
    public static final String col6_mobno="MobileNO";




    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null,1);

        SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + " (" + col1_uid + " TEXT PRIMARY KEY, "+col2_fname+" TEXT, "+ col3_lname+ " TEXT, " + col4_passwd +" TEXT, "+ col5_email +" TEXT," + col6_mobno +" TEXT)");

        Log.d("Database Operations","Table Created....");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        //sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        //onCreate(sqLiteDatabase);

    }

    public void addDetails(String uid, String fname, String lname, String passwd, String email, String mobno, SQLiteDatabase database)
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put(col1_uid,uid);
        contentValues.put(col2_fname,fname);
        contentValues.put(col3_lname,lname);
        contentValues.put(col4_passwd,passwd);
        contentValues.put(col5_email,email);
        contentValues.put(col6_mobno,mobno);

        database.insert(TABLE_NAME,null,contentValues);

        Log.d("Database Operations","One row inserted....");


    }

}

package com.example.baozhiqi;

import android.content.Context;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DBO_lip extends SQLiteOpenHelper {

    public static final String NAME="name";
    public static final String OTHER="other";
    public static final String DATE1="date1";
    public static final String DATE2="date2";
    public static final String DATE3="date3";
    public static final String TABLE_NAME="notes";
    public static final String ID="_id";


    public DBO_lip(Context context)  {
        super(context, "notes", null, 1);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE "
                        +TABLE_NAME +"("
                        +ID
                        + " INTEGER PRIMARY KEY AUTOINCREMENT,"+OTHER+" TEXT NOT NULL,"
                        +NAME +" TEXT NOT NULL," +DATE1+" TEXT NOT NULL,"+DATE2+" TEXT NOT NULL,"+DATE3+" TEXT NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("数据库","--版本更新"+oldVersion+"-->"+newVersion);

    }
}

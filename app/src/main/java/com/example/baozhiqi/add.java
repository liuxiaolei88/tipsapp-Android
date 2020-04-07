package com.example.baozhiqi;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class add extends Activity{

    private EditText mEt1;
    private EditText mEt2;
    private EditText mEt3;
    private EditText mEt4;
    private EditText mEt5;
    private ImageView con;
    private ImageView back;
    private DBOpenHelper dbOpenHelper;
    private SQLiteDatabase dbWrite;
    private  String val;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        val = getIntent().getStringExtra("flag");
        mEt1 = (EditText) this.findViewById(R.id.add_name);
        mEt2 = (EditText) this.findViewById(R.id.add_other);
        mEt3 = (EditText) this.findViewById(R.id.add_date1);
        mEt4 = (EditText) this.findViewById(R.id.add_date2);
        mEt5 = (EditText) this.findViewById(R.id.add_date3);
        ImageView con = (ImageView) findViewById(R.id.but_con);
        ImageView back = (ImageView) findViewById(R.id.back_add);

        dbOpenHelper = new DBOpenHelper(this);
        dbWrite = dbOpenHelper.getReadableDatabase();

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbAdd();
                finish();
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(add.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }





    public void DbAdd() {
        ContentValues cv = new ContentValues();
        cv.put(DBOpenHelper.NAME,mEt1.getText().toString());
        cv.put(DBOpenHelper.OTHER,mEt2.getText().toString());
        cv.put(DBOpenHelper.DATE1,mEt3.getText().toString());
        cv.put(DBOpenHelper.DATE2,mEt4.getText().toString());
        cv.put(DBOpenHelper.DATE3,mEt5.getText().toString());
        dbWrite.insert(dbOpenHelper.TABLE_NAME,null,cv);
    }


}
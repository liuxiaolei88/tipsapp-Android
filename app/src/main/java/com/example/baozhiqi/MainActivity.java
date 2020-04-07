package com.example.baozhiqi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static com.example.baozhiqi.R.id.add_button1;
import static com.example.baozhiqi.R.id.e_name;


public class MainActivity extends AppCompatActivity {
    private DBOpenHelper db;
    private Button button;
    private Spinner spinner;
    private  ArrayAdapter<adp> adpArrayAdapter=null;
    private List<E_list> mData;
    private Context mContext;
    private  adp mAdapter;
    private  ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=MainActivity.this;
        listView=(ListView)findViewById(R.id.list_main) ;
        mData=new LinkedList<E_list>();
        mData.add(new E_list("感康","药品","2020/3/2","265天",R.mipmap.e_img_md));
        mData.add(new E_list("达克宁","药品","2020/2/7","432天",R.mipmap.e_img_md));
        mData.add(new E_list("头孢","药品","2020/2/9","500天",R.mipmap.e_img_md));
        mAdapter=new adp((LinkedList<E_list>)mData,mContext);
        listView.setAdapter(mAdapter);







        spinner = (Spinner) findViewById(R.id.spinner1);
        String[] mItems=getResources().getStringArray(R.array.dock1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mItems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);



    };



  private  class  adp extends  BaseAdapter {

      private LinkedList<E_list> mData;
      private Context mContext;

      public adp(LinkedList<E_list> mData, Context mContext) {
          this.mData = mData;
          this.mContext = mContext;
      }

      @Override
      public int getCount() {
          return mData.size();
      }

      @Override
      public Object getItem(int position) {
          return null;
      }

      @Override
      public long getItemId(int position) {
          return position;
      }

      @Override
      public View getView(int position, View convertView, ViewGroup parent) {
          convertView = LayoutInflater.from(mContext).inflate(R.layout.elist, parent, false);
TextView tx1=(TextView)convertView.findViewById(R.id.e_name);
          TextView tx=(TextView)convertView.findViewById(R.id.e_name);
          TextView tx2=(TextView)convertView.findViewById(R.id.e_type);
          TextView tx3=(TextView)convertView.findViewById(R.id.e_date1);
          TextView tx4=(TextView)convertView.findViewById(R.id.e_date2);
          ImageView img1=(ImageView)convertView.findViewById(R.id.e_img) ;
          tx.setText(mData.get(position).getName());
          tx2.setText(mData.get(position).getType());
          tx3.setText(mData.get(position).getDate1());
          tx4.setText(mData.get(position).getDate2());
          img1.setBackgroundResource(mData.get(position).getImg());
          return  convertView;
      }
  }
}








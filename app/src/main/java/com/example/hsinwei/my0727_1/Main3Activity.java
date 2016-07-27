package com.example.hsinwei.my0727_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    //String[] str={"AA1","BB1","CC1","AA2","BB2","CC2"};   //String 建構式
    ListView lv3;
    ArrayList<Student> mylist;   //ArrayList 建構式
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mylist = new ArrayList<>();
        mylist.add(new Student(R.drawable.f01,"AA","12345"));
        mylist.add(new Student(R.drawable.f02,"BB","34567"));
        mylist.add(new Student(R.drawable.f03,"CC","56789"));

        //BaseAdapter
        MyAdapter madpt = new MyAdapter(Main3Activity.this,mylist);
        lv3 = (ListView)findViewById(R.id.listView3);
        lv3.setAdapter(madpt);
    }
}

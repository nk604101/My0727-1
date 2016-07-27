package com.example.hsinwei.my0727_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {
    String[] str={"AA1","BB1","CC1","AA2","BB2","CC2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        //BaseAdapter
        MyAdapter madpt = new MyAdapter(Main3Activity.this,str);
        ListView lv3 = (ListView)findViewById(R.id.listView3);
        lv3.setAdapter(madpt);
    }
}

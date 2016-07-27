package com.example.hsinwei.my0727_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {
    ArrayList<Map<String,String>> al1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        al1=new ArrayList<>();

        HashMap<String,String> m1 =new HashMap<>();
        m1.put("list","List1-1");
        m1.put("inside","List1-2");
        al1.add(m1);

        HashMap<String,String> m2 =new HashMap<>();
        m2.put("list","List2-1");
        m2.put("inside","List2-2");
        al1.add(m2);

        HashMap<String,String> m3 =new HashMap<>();
        m3.put("list","List3-1");
        m3.put("inside","List3-2");
        al1.add(m3);

        ListView lv2 =(ListView)findViewById(R.id.listView2) ;

        SimpleAdapter Sadpt=new SimpleAdapter(Main2Activity.this,
                al1,
                android.R.layout.simple_list_item_2,
                new String[]{"list","inside"},
                new int[]{android.R.id.text1,android.R.id.text1});

        lv2.setAdapter(Sadpt);
    }
}

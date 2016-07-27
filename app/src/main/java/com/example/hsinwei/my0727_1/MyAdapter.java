package com.example.hsinwei.my0727_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hsinwei on 2016/7/27.
 *   BaseAdapter 需實作四個抽象類別
 */
public class MyAdapter extends BaseAdapter {
    //因為要一個 Context 做 View 類別的 constructor
    //用本身建構式讓呼叫的類別提供他現在的 Context
    //用本身建構式讓由呼叫的類別提供他現在的 String
    Context context;
    String[] str;
    ArrayList<Student> data;
    public MyAdapter(Context c,ArrayList<Student> list)
    {
        context = c;
        data=list;
    }
    public MyAdapter(Context c,String[] s)
    {
        context = c;
        str=s;
    }
    public MyAdapter(Context c)
    {
        context = c;
    }

    @Override
    public int getCount() {

        //return 5;   //顯示的資料數目量
        //return str.length;//字串數量
        return data.size(); //ArrayList數量
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    /**
     *
     * @param position   位置標示由0開始 看幾個項目
     * @param convertView
     * @param parent
     * @return  View類別
     * 將資料傳給呼叫的類別
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //多個 View物件
        LayoutInflater inflater = LayoutInflater.from(context);//選擇目前要顯示在哪一個畫面主體

        View v = inflater.inflate(R.layout.listitem,null); //將自訂的Layout 讀出 listitem是檔案名稱

        //View = Layout內所有 View 元件
        // 這個layout有三個元件 ImageView TextView TextView
        ImageView img = (ImageView) v.findViewById(R.id.imageView);
        img.setImageResource(data.get(position).photoID);

        TextView tv1= (TextView)v.findViewById(R.id.textView2);
        tv1.setText(data.get(position).name);

        TextView tv2= (TextView)v.findViewById(R.id.textView3);
        tv2.setText(data.get(position).phone);

        return v;   //回傳 View v回傳給呼叫的類別
        /*  //一般傳單一View物件
        TextView tv = new TextView(context);
        tv.setText(str[position]);
        return tv;*/
    }
}

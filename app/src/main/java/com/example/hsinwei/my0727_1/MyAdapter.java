package com.example.hsinwei.my0727_1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Hsinwei on 2016/7/27.
 *   BaseAdapter 需實作四個抽象類別
 */
public class MyAdapter extends BaseAdapter {
    //因為要一個 Context 做 View 類別的 constructor
    //由呼叫的類別提供他現在的 Context
    Context context;
    public MyAdapter(Context c)
    {
        context = c;
    }

    @Override
    public int getCount() {
        return 5;   //顯示的資料數目量
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
        TextView tv = new TextView(context);
        tv.setText("Hello"+position);
        return tv;
    }
}

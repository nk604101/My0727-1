package com.example.hsinwei.my0727_1;

/**
 * Created by Hsinwei on 2016/7/27.
 *  傳送的 ArrayList 自訂內容用的格式
 *  要傳 圖片 名字 電話
 */
public class Student {
    public int photoID;
    public String name;
    public String phone;

    public Student(int id, String n, String p)
    {
        photoID=id;
        name=n;
        phone=p;
    }
}

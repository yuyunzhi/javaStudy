package com.company.java;

import com.company.java.model.FileNews;
import com.company.java.model.News;

import java.io.IOException;

//继承
//News父类，FileNews是子类
public class Demo03 {
    public static void main(String[] args) throws IOException{

            //new
            News news = new News("hahaha","lalala");
            news.display();

            //new 子类   子类继承了父类
            FileNews fileNews = new FileNews("kakak","dadada");
          fileNews.display();//继承了父类的display

            FileNews fileNews1 = new FileNews();
            fileNews1.read("res/input.txt");
            fileNews1.display();//继承了父类的display


    }
}

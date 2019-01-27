package com.company.java;

import com.company.java.model.News;

/*
封装一个类，用来传入title ,content初始化内容
 */
public class Demo02 {
    public static void main(String[] args){

        News news = new News("标题啊","内容啊");
        System.out.println(news.display());
    }
}

package com.company.java;

import java.io.IOException;

/*
封装一个类，用来传入url文件地址
new这个类，调用接口函数
读取该文件的标题，内容
 */
public class Demo02 {
    public static void main(String[] args){

        News news = new News();
        news.read( "res/input.txt");
        System.out.println(news.display());
    }
}

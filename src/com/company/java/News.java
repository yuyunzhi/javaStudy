package com.company.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class News {
    //加final的原因是防止set函数再修改变量
    private final String title;
    private final String content;

    //构造的自由和责任让用户来做,由用户定义title content
    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    //控制如何显示
    public String display(){

        return title+"\n"+content;
    }

}

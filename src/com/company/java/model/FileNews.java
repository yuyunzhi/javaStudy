package com.company.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileNews extends News{
    //继承父类 变量和方法
    public FileNews(String title, String content) {
        super(title, content);
    }

    //定义新的函数，与父类不一样的地方
    public void read(String fileUrl) {
        try {
            //从路径中读取文件，转为流，放入缓存中
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileUrl)));

            title=reader.readLine();
            content = reader.readLine();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            System.out.println("新闻出错");
        }
    }


}



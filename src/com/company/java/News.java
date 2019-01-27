package com.company.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class News {
    private String title;
    private String content;

    public void read(String fileUrl){
        //从“纯文本”文件中读取内容
        //赋值给title
        //赋值给content

        try {
            //找到文件，转化为流，放入缓存中
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileUrl)));

            title=reader.readLine();
            content = reader.readLine();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            System.out.println("新闻出错");
        }
    }
    public String display(){

        return title+"\n"+content;
    }

}

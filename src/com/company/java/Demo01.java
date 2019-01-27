package com.company.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Arrays;

/*
从文件res/input.txt读取内容，并写入文件res/output.txt
 */
public class Demo01 {

    public static void main(String[] args) throws IOException {
 /*       //标准输入, 和Reader
        InputStream val =System.in;
        //转化为字节
        InputStreamReader stdReader = new InputStreamReader(System.in);
        //使用字符的方式输出

        char[] buffer =new char[20];
        int length = stdReader.read(buffer);

        System.out.println(length);*/

        //从一个文件读取内容，输出到另一个文件
        FileInputStream input = new FileInputStream("res/input.txt");
        FileOutputStream output = new FileOutputStream("res/output.txt");

        //读取和输出成字符
        InputStreamReader reader = new InputStreamReader(input,"UTF-8");
        OutputStreamWriter writer = new OutputStreamWriter(output,"UTF-8");

        BufferedReader bufferedReader = new BufferedReader(reader);
        PrintWriter printer = new PrintWriter(writer);

        String context = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            context += line+"\n" ;
        }

        //当读取完毕的时候，关闭。注意关闭顺序
        reader.close();
        input.close();

        printer.print(context);

        //当写完后，关闭。注意关闭顺序
        printer.close();
        output.close();





    }
}

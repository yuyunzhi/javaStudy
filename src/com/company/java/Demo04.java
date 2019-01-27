package com.company.java;

import com.company.java.model.FileNewsReader;

/*
抽象类
父类:NewsReader
子类:UrlNewsReader FileNewsReader
子类override父类的abstract的函数
 */
public class Demo04 {
    public static void main(String[] args){
        FileNewsReader fileNewsReader = new FileNewsReader();
        fileNewsReader.readerNews("asdf");
    }
}

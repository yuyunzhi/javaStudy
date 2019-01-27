package com.company.java;

import com.company.java.model.FileNewsReader;

//抽象类  父类 为 NewsReader  子类为 UrlNewsReader FileNewsReader
public class Demo04 {
    public static void main(String[] args){
        FileNewsReader fileNewsReader = new FileNewsReader();
        fileNewsReader.readerNews("asdf");
    }
}

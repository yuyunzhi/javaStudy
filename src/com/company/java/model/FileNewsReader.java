package com.company.java.model;

public class FileNewsReader extends NewsReader {

    @Override
    public News readerNews(String path) {
        System.out.println("我是从抽象类继承过来的类");
        return new News("abc","balalala");
    }

}

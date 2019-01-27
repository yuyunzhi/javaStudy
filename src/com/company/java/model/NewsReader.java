package com.company.java.model;

public abstract class NewsReader {

    private Integer x;
    public void NewsReader(Integer x){
        this.x = x;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    //子类具有这个功能，具体的实现在子类中确定
    public abstract News readerNews(String path);
    /*
    1、从文件中读取FileNewsReader
    2、从网络中读取UrlNewsReader
     */

}

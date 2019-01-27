package com.company.java.model;

//父类
public class News {
    //加protected 是因为，子类和同包可以访问
    protected  String title;
    protected  String content;

    //构造的自由和责任让用户来做,由用户定义title content
    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public  News() {

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

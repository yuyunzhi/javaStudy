package com.company.java.model;

public class Video implements Displayable {
    @Override
    public void display() {
        System.out.println("我是通过video播放的");
    }
}

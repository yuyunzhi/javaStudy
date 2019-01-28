package com.company.java;

import com.company.java.model.Displayable;
import com.company.java.model.News;
import com.company.java.model.Video;

/**
 * 多态
 */
public class Demo06 {

    public static void main(String[] args){
        News news = new News("abc","abc1");
        Video video = new Video();

        viewNews(news);
        viewNews(video);

    }
    private static void viewNews(Displayable item){
        item.display();
        System.out.print("播放完毕");
    }
}

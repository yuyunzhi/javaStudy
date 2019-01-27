package com.company.java;

import com.company.java.model.Displayable;
import com.company.java.model.News;
import com.company.java.model.Video;

/*
接口
 */
public class Demo05 {
    public static void main(String[] args){

        News news = new News("abc","abc1");
        Video video = new Video();

        viewVideo(news);
        viewNews(video);


    }
    private static void viewNews(Displayable item){
        item.display();
        System.out.print("播放完毕");
    }

    private static void viewVideo(News item){
        item.display();
        System.out.print("播放完毕");
    }

    private static void viewLecture(Video item){
        item.display();
        System.out.print("播放完毕");
    }
}

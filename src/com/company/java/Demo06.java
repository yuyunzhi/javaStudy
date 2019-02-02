package com.company.java;

import com.company.java.model.Displayable;
import com.company.java.model.News;
import com.company.java.model.Video;

/**
 * 多态：父类型或接口中的同一个方法, 在子类型或接口的具体对象里, 有不同实现方法!
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

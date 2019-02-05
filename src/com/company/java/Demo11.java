package com.company.java;

import com.company.java.model.NewThread;


/**
 * 进程VS线程
 * 通过继承Thread类，来创建线程
 * 如果需要创建多个不同逻辑的线程，就多次继承Thread类，写不同的逻辑代码
 * 或者，在一个继承后的类，run里面用if else 判断写不同的逻辑
 */
public class Demo11 {

    //主线程
    public static void main(String args[]){
        //创建新的子线程,NewThread是通过继承Thread
        NewThread t1 = new NewThread(); //初始化，start()，子线程开始执行，主线程返回main方法,开始执行下面的内容

        //执行主线程
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main interrupted.");
        }
        System.out.println("Exiting Main thread.");
    }
}

package com.company.java;

import com.company.java.model.Caller;
import com.company.java.model.Callme;

/**
 * synchronized关键字修饰的方法
 * 当一个线程在一个同步方法内部，所有试图调用该方法（或其他同步方法）的同实例的其他线程必须等待。
 * 为了退出管程，并放弃对对象的控制权给其他等待的线程，拥有管程的线程仅需从同步方法中返回。
 *
 * 删除Callme的synchronized来运行，看看结果
 */
public class Demo12 {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
        // wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

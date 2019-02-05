package com.company.java.model;

// Create a second thread by extending Thread
public class NewThread extends Thread {
    public NewThread() {
        // Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);


        //显示地开始执行这个线程！自动做一些基本的初始化操作，自动开始run()
        start(); // Start the thread
    }


    // run是子线程的路口
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }

}


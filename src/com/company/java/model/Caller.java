package com.company.java.model;

public class Caller implements Runnable{
    String msg;
    Callme target;
    public Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();//start后会自动执行run（）方法
    }

    public void run() {
        //调用了Caller的方法
        target.call(msg);
    }
}

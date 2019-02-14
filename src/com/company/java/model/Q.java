package com.company.java.model;

public class Q{
    //仓库
    int n;
    boolean valueSet = false;

    //消费者
    public synchronized int get() {
        // value 还没有被设置好!
        if (!valueSet)
            try {
                System.out.println("执行了1");
                wait(); // 暂停, 等待着put()来设置好这个值只后再读取
                System.out.println("执行了2");
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got: " + n);
        valueSet = false; // 标记已经取走了值
        notify(); // 通知put()可以设置另外一个值了
        return n;
    }

    //生产者
    public synchronized void put(int n) {
        // 如果这个值已经设置好了
        System.out.println("a");
        if (valueSet)
            try {
                System.out.println("b");
                wait(); // 等待get()把值取走
                System.out.println("c");
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        System.out.println("d");
        this.n = n; //设置一个新的值
        valueSet = true; // 标记已经设置好了
        System.out.println("Put: " + n);
        System.out.println("e");
        notify(); // 通知线程get() 这个最新的值
        System.out.println("f");
    }
}

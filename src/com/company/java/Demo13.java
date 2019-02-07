package com.company.java;

import com.company.java.model.Q;

/**
 * 多线程之间通信
 */
public class Demo13 {

    public static void main(String args[]){
        Q q = new Q();
        q.get();
        q.put(1);

    }
}

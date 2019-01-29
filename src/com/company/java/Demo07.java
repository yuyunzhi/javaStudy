package com.company.java;


import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 数据结构
 * 哈希表
 * 栈
 * 队列
 */
public class Demo07 {
    public static void main(String[] args)  {
        //  哈希表
        HashMap<String,String> gender = new HashMap<String,String>();
        //增
        gender.put("yukaka","male");
        gender.put("liuwen","female");
        //查
        if(gender.containsKey("yukaka")){
            System.out.println(gender.get("yukaka"));
        }
        //改 和增一样，直接覆盖
        gender.put("liuwen","male");
        //删
        gender.remove("liuwen");


        //栈，先进后出，后进先出
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(3);
        stack.push(5);


        //只看顶部数据，但不删除
        System.out.println( stack.peek());

        System.out.println(stack.pop()); //5
        System.out.println(stack.pop());//3
        //检查是否为空
        System.out.println(stack.empty());


        //队列，先进先出，后进后出,注意Queue是一个借口，所以不能实例化
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(9);
        queue.add(6);
        //获取队列顶部数据
        Integer firstQueue = queue.peek();
        System.out.println(firstQueue);

        System.out.println(queue.poll()); //9
        System.out.println(queue.poll()); //6
        //检查是否为空
        System.out.println(queue.isEmpty());




    }
}

package com.company.java;

import com.company.java.model.TwoSums;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Java中的集合集成结构
 *  Map:HashMap，注意添加内容的时候用put   key value键值对
 *  List：ArrayList 注意添加内容用add
 *  Set:HashSet 注意添加内容用add
 *  Queue
 */
public class Demo10 {

    public static void main(String[] args){

       /*
       给一个整数数组，找到两个数使得他们的和等于一个给定的数 target，
       你需要实现的方法twoSum需要返回这两个数的下标,
        并且第一个下标小于第二个下标。注意这里下标的范围是 0 到 n-1。
       PS: 你可以假设只有一组答案。
       如 ： 给出 numbers = [2, 7, 11, 15], target = 9, 返回 [0, 1].
       */

       TwoSums twoSums = new TwoSums();
       int[] numbers = new int[]{2, 7, 11, 15};
       int target =9;
       ArrayList<Integer> result = twoSums.getTwoSums(numbers,target);
       System.out.println(result);//[0,1]



        //列表

        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        System.out.println( arrayList.subList(2,4)); //[3,4]
        System.out.println( arrayList.get(3));//4
        //for 循环
        for(String item : arrayList){
           // System.out.println(item);
        }


        //Set ----主要用于去重操作
        Set<String> set = new HashSet<>();

        set.add("lang");
        set.add("bob");
        set.add("john");
        set.add("lang");
        set.add("john");

        for(String item : set){
            System.out.println(item); //注意，这里重复的会自动被去掉

        }

    }
}

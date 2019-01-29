package com.company.java;

import com.company.java.sort.BubbleSort;

import java.util.Arrays;

/**
 * 排序
 */
public class Demo08 {
    public static void main(String[] args){

        //冒泡排序
        int[] nums=new int[]{5,1,7,3,9,2,0,3,4,11,47,29,41,22,16,20};
        BubbleSort bubbleSort = new BubbleSort();
        int[] newNums =bubbleSort.bubbleSort(nums);
        System.out.println(Arrays.toString(newNums));
    }
}

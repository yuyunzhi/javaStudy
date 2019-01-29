package com.company.java.sort;

public class BubbleSort {

    public int[] bubbleSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {

                if (nums[j - 1] > nums[j]) {

                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }



}

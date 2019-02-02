package com.company.java.model;

import java.util.*;

public class TwoSums {

     public ArrayList<Integer> getTwoSums(int[] numbers,Integer target){

        // 出现过什么样的数字为key，原来的位置为value

        Map<Integer,Integer> numMap = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            numMap.put(numbers[i],i);
        }

        //找到一堆数的和===target!
        for(int j=0;j<numbers.length;j++){
            if(numMap.containsKey(target-numbers[j])){
                ArrayList<Integer> results= new ArrayList<>();
                results.add(numMap.get(target-numbers[j]));
                results.add(j);
                return results;

            }
        }
        return null;
    }

}

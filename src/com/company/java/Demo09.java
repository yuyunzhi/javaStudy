package com.company.java;

import com.company.java.model.Stacker;

/**
 * 泛型
 * Stacker 可以接受多个类型的参数，因为使用了泛型
 * 与多态的区别是：多态是接口和父类指向自己或子类
 */
public class Demo09 {

    public static void main(String[] args){

        Stacker<String> stringStacker= new Stacker<>();
        stringStacker.push("abc");
        String getString = stringStacker.pop();
        System.out.println(getString);

        Stacker<Integer> integerStacker = new Stacker<>();
        integerStacker.push(5);
        int getInteger = integerStacker.pop();
        System.out.println(getInteger);
    }
}

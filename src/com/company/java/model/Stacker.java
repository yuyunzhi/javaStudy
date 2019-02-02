package com.company.java.model;

import java.util.ArrayList;

/**
 * 使用泛型创建一个栈
 * 泛型的目的是为了可以传入不同类型的参数，来减少重复性代码
 * @param <T>
 */
public class Stacker<T> {

    ArrayList<T> store = new ArrayList<T>();

    public void push(T item){
        store.add(item);
    }

    public T pop(){
        T temp = store.get(store.size()-1);
        store.remove(store.size()-1);
        return temp;
    }

}

package com.tkx.java.基础;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月19日 11:08
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        //1.得到所在的数组下标，如果这个位置没有任何元素，利用CAS添加
        //如果由元素，就(利用synchronize)锁住头节点，进行添加或者更新操作
        // 关键词为 cas 和 synchronized
        map.put(1,1);
        //无锁
        map.get(1);
    }
}

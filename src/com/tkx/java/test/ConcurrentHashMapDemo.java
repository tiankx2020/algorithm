package com.tkx.java.test;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月02日 10:02
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        map.put(1,1);
    }
}

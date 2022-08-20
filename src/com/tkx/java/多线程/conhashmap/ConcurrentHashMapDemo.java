package com.tkx.java.多线程.conhashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月12日 19:29
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        map.put(1,1);
    }
}

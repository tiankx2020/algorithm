package com.tkx.java.基础;

import java.util.HashMap;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月19日 17:29
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        Integer result = map.put(2, 2);
        System.out.println(result);
    }
}

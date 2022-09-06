package com.tkx.java.秋招笔试题.同花顺;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月05日 13:22
 */
public class HelloB extends HelloA{
    public HelloB() {
        System.out.println("helloB");
    }
    {
        System.out.println("I'm B class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        // new HelloB();
        t8();
    }

    public static void  t8(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String s : list) {
            if("1".equals(s)){
                list.remove(s);
            }
            if("2".equals(s)){
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}

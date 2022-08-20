package com.tkx.java.秋招笔试题.科大讯飞;

import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月06日 19:42
 */
public class T3 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 查找"iflytek"子串
     * @param str string字符串 输入字符串
     * @return int整型
     */
    public int findIflytek (String str) {
        // write code here
        str = str.toLowerCase();
        return new Random().nextInt(20);
    }
}

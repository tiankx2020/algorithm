package com.tkx.java.leecode周赛.D291;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月02日 9:11
 */
public class T4 {
    public long appealSum(String s){
        long res = 0;
        //记录字符的位置
        int[] nums = new int[26];
        Arrays.fill(nums,-1);
        int sum = 0 ;
        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i)-'a';
            //sum表示添加字符s[i]后，引量增加的值
            // 这里为什么是sum+=i-nums[cur] 而不是 sum=i-nums[cur]
            // sum表示没有加入s[i]的引量值
            // i-nums[cur]表示以s[i]结尾的子字符串的引量增加值
            // 示例1 abbc   示例2 abbb
            // 假设 sum = a
            //从示例1开始看
            // sum = sum+3-(-1) = sum+4
            // c , bc , bbc , abbc
            // 1 , 1+1  , 1+1   , 2+1
            // sum = 0+1+1+2+ 4 // (0+1+1+2)是原来的sum值

            //从示例2开始看
            //sum = sum+(3-2) = sum+1;
            //b ,bb, bbb, abbb
            //1 ,1 , 1  , 2
            //1 ,1+0,1+0 ,2+0
            //sum = 1+1+2+1  // （1+1+2)是原来的sum


            // s =  1 , 2 ,3 ,4  ,5 , 6 ,3
            // 子串1 3
            //
            sum+=i-nums[cur];
            System.out.println(sum);
            res+=sum;
            nums[cur] = i;
        }
        return res;
    }
}

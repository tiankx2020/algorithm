package com.tkx.java.秋招笔试题.蚂蚁;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月22日 10:27
 */
public class LL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] nums = new int[26];
        for (char c : s.toCharArray()) {
            nums[c-'a']++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                System.out.println((char)('a'+i)+""+nums[i]);
            }
        }
    }
}

package com.tkx.java.秋招笔试题.redbook;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月04日 17:36
 */
public class T2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        if(n<2){
            System.out.println(Math.abs(nums[0]-7));
            return;
        }
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                nums[i] = -nums[i];
                nums[i-1] = -nums[i-1];
            }else{
                break;
            }
        }
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            res+=Math.abs(nums[i]-1);
        }
        res+=Math.abs(nums[n-1]-7);
        System.out.println(res);
    }
}

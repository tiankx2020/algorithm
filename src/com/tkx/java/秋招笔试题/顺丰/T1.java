package com.tkx.java.秋招笔试题.顺丰;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月31日 16:47
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  =sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = i+1;
        }
        List<List<Integer>> permute = permute(nums);
        int num = permute.size();
        int res = 1;
        while (num>=2){
            num/=2;
            res++;
        }
        System.out.println(res);
    }

    static List<List<Integer>> ans;
    static List<Integer> tmp;
    public static List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        tmp = new ArrayList<>();
        dfs(nums,0);
        return ans;
    }
    public static void  dfs(int[] nums, int index){
        if(index==nums.length){
            ans.add( new ArrayList<>(tmp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=-10 && nums[i]<=10){
                int t = nums[i];
                tmp.add(nums[i]);
                nums[i] = 11;
                dfs(nums,index+1);
                nums[i]= t;
                tmp.remove(tmp.size()-1);
            }
        }
    }
}

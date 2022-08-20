package com.tkx.java.热点题目;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月11日 14:49
 */
public class 找到所有数组中消失的数字 {

    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20)+1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            //这个数不在自己的位置上
            while(nums[i]!=i+1){
                if(nums[nums[i]-1]== nums[i]) break;
                int t = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = t;
            }
        }
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
}

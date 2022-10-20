package com.tkx.java.每日一题;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月19日 15:25
 */
public class T1636 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        frequencySort(nums);
    }
    public  static int[] frequencySort(int[] nums) {
        // 计算每个值的数量
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count + 1);
        }
        int[][] arr = new int[map.size()][2];
        int index = 0;
        for (int key : map.keySet()) {
            arr[index][0] = key;
            arr[index][1] = map.get(key);
            index++;
        }
        // 排序 数量小的排在前面
        // 数量相同的情况下，数值大的排在前面
        Arrays.sort(arr,(a,b)->{
            if(a[1]!=b[1]) return a[1]-b[1];
            else return b[0]-a[0];
        });
        List<Integer> list = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i][1];j++){
                list.add(arr[i][0]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return  res;
    }
}

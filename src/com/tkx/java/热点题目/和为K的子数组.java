package com.tkx.java.热点题目;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月11日 16:19
 */
public class 和为K的子数组 {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k =  2;
        subarraySum(arr,k);
    }
    //可以利用0-1背包解决这个问题
    public static int subarraySum(int[] nums, int k) {
        //不太清除 map代表什么意思
        //map表示前缀和的个数
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int pre = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            //前缀和
            pre+=nums[i];

            if(map.containsKey(pre-k)){
                ans+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return  ans;
    }



}

package com.tkx.java.leecode周赛.Airwallex288;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月10日 11:18
 */
public class D3 {
    /**
     输入：
     [92,36,15,84,57,60,72,86,70,43,16]
     62
     输出：
     55326829
     预期：
     800222867
     * @param nums
     * @param k
     * @return
     */
    // public int maximumProduct(int[] nums, int k) {
    //     //总的沉积
    //     long multi = 1;
    //     for(int i=0;i< nums.length;i++){
    //         if(nums[i]==0&&k>0){
    //             nums[i]++;
    //             k--;
    //         }
    //         multi*=nums[i];
    //     }
    //     for(;k>0;k--){
    //         int maxIndex = 0;
    //         long maxNum = multi/nums[0];
    //         for(int i=0;i<nums.length;i++){
    //             if(multi/nums[i]>maxNum){
    //                 maxIndex = i;
    //                 maxNum =multi/nums[i];
    //             }
    //         }
    //         nums[maxIndex]++;
    //         multi = multi*nums[maxIndex]/(nums[maxIndex]-1);
    //     }
    //     return (int)(multi%(1000000007));
    // }

    public int maximumProduct(int[] nums, int k) {
        long tmp = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
        for (int i = 0; i < k; i++) {
            pq.add(pq.poll()+1);
        }
        for(int x:pq){
            tmp = tmp*x%1000000007;
        }
        return (int)tmp;
    }
}

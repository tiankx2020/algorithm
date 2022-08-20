package com.tkx.java.热点题目;

import java.util.Arrays;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月08日 20:12
 */
public class 分割等和子集 {
    int sum = 0;

    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) return false;
        sum /= 2;
        //转换为0-1背包问题
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for(int i=0;i<nums.length+1;i++){
            dp[i][0] = true;
        }
        // 投任意数量的商品，使得重量为sum
        //分别遍历每个商品的重量
        for(int i=0;i<nums.length;i++){
            //背包的重量
            for (int j = 0; j < sum + 1; j++) {
                if(j-nums[i]>=0){
                    //选这个商品
                    dp[i][j] = dp[i][j] || dp[i-1][j-nums[i]];
                }
                //不选这个商品
                dp[i][j] =dp[i][j] || dp[i-1][j];
            }
        }
        for(int i=0;i< nums.length+1;i++){
            if(dp[i][sum]==true) return true;
        }
        return false;
    }


}

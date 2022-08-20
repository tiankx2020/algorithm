package com.tkx.java.leecode周赛.D291;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月01日 11:24
 */
public class T3 {
    public int countDistinct(int[] nums, int k, int p) {
        boolean[] f = new boolean[nums.length];
        for(int i=0;i<f.length;i++){
            if(nums[i]%p==0) f[i]=true;
        }
        Set<String> set = new HashSet<>();
        for(int i=0;i<f.length;i++){
            for(int j=0;j<=i;j++){
                int num = 0;
                List<Integer> list = new ArrayList<>();
                for(int t=j;t<=i;t++){
                    if(f[t]==true) num++;
                    list.add(nums[t]);
                }
                if(num<=k)
                    set.add(list.toString());
            }
        }
        return set.size();
    }
}

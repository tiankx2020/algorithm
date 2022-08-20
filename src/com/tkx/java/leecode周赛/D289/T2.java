package com.tkx.java.leecode周赛.D289;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 10:30
 */
public class T2 {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int task : tasks) {
            map.put(task,map.getOrDefault(task,0)+1);
        }
        int ans = 0;
        for(int x:map.values()){
            if(x==1){
                return -1;
            }else{
                ans+=(x+2)/3;
            }
        }
        return ans;
    }
}

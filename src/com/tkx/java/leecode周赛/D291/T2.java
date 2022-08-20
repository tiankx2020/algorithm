package com.tkx.java.leecode周赛.D291;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月01日 11:21
 */
public class T2 {
    public int minimumCardPickup(int[] cards) {
        int ans = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                if(ans==-1){
                    ans = i-map.get(cards[i])+1;
                }else{
                    ans = Math.min(ans,i-map.get(cards[i])+1);
                }
            }
            map.put(cards[i],i);
        }
        return ans;
    }
}

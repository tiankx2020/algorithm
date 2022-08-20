package com.tkx.java.每日一题;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月13日 9:22
 */
public class RandomizedSet {
    int index = 0;
    //由索引映射到值
    Map<Integer,Integer> map1 = new HashMap<>();
    //由值映射到索引
    Map<Integer,Integer> map2 = new HashMap<>();
    Random r = new Random();
    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if(map2.containsKey(val)){
            return false;
        }else{
            map2.put(val,index);
            map1.put(index,val);
            index++;
            return true;
        }
    }

    public boolean remove(int val) {
        if(map2.containsKey(val)){
            int index = map2.get(val);
            map2.remove(val);
            map1.remove(index);
            return true;
        }else{
            return false;
        }
    }

    public int getRandom() {
        for(;;){
            int x = r.nextInt(index);
            if(map1.containsKey(x)){
                return map1.get(x);
            }
        }
    }
}

package com.tkx.java.leecode周赛.D391;

/**
 * @Author tkx
 * @Date 2024 03 31
 **/
public class T2 {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = 0;
        // 空瓶子的数量
        int numEmpty  = 0;
        while (numBottles>0 || numEmpty>=numExchange){
            res+=numBottles;
            numEmpty+=numBottles;
            numBottles=0;
            if(numEmpty>=numExchange){
                numEmpty-=numExchange;
                numBottles++;
                numExchange++;
            }
        }
        return res;
    }
}

package com.tkx.java.笔试题.耀乘健康;

import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月01日 11:02
 */
public class T1 {
    public static void main(String[] args) {
        factorization(24);
    }
    public static ArrayList<ArrayList<Integer>> factorization (int n) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int tmp = n;
        for(int i=2;i<=n;i++){
            while(tmp%i==0){
                map.put(i,map.getOrDefault(i,0)+1);
                tmp/=i;
            }
            if(tmp==1) break;
        }
        for(int x:map.keySet()){
            ArrayList<Integer> t = new ArrayList<>();
            t.add(x);
            t.add(map.get(x));
            ans.add(t);
        }
        return  ans;
    }
}

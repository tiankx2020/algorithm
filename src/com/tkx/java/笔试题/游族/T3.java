package com.tkx.java.笔试题.游族;

import java.util.ArrayList;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月13日 19:58
 */
public class T3 {
    public int Trap (ArrayList<Integer> height) {
        int res = 0;
        int[] left = new int[height.size()];
        int[] right = new int[height.size()];

        for(int i=0;i<height.size();i++){
            if(i==0) left[i] = height.get(i);
            else left[i] = Math.max(left[i-1],height.get(i));
        }

        for(int i=height.size()-1;i>=0;i--){
            if(i==height.size()-1) right[i] = height.get(i);
            else right[i] = Math.max(right[i+1],height.get(i));
        }

        for(int i=0;i<height.size();i++){
            res+=Math.min(left[i],right[i])-height.get(i);
        }
        return res;
    }
}

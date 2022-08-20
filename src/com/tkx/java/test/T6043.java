package com.tkx.java.test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月24日 14:21
 */
public class T6043 {
    public int[] countRectangles(int[][] rectangles, int[][] points) {
        int[] arr = new int[points.length];
        Arrays.sort(rectangles,(a,b)->b[0]-a[0]);
        HashMap<int[],Integer> map = new HashMap<>();
        for(int i=0;i<points.length;i++){
            map.put(points[i],i);
        }
        Arrays.sort(points,(a,b)->a[0]-b[0]);
        for(int i=0;i<points.length;i++){
            int tmp = 0;
            for(int j=0;j<rectangles.length;j++){
                if(rectangles[j][0]>=points[i][0]){
                    if(rectangles[j][1]>=points[i][1]){
                        tmp++;
                    }
                }else{
                    break;
                }
            }
            arr[map.get(points[i])]=tmp;
        }
        return arr;
    }
}

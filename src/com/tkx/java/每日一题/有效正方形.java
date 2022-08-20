package com.tkx.java.每日一题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年07月29日 8:16
 */
public class 有效正方形 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        List<int[]> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        Collections.sort(list,(a,b)->{
            return a[0]==b[0]?a[0]-b[0]:a[1]-b[1];
        });
        int[] arr1 = list.get(0);
        int[] arr2 = list.get(1);
        int[] arr3 = list.get(2);
        int[] arr4 = list.get(3);
        int l1 = Math.abs(arr1[0]-arr2[0])*Math.abs(arr1[0]-arr2[0])+Math.abs(arr1[1]-arr2[1])*Math.abs(arr1[1]-arr2[1]);
        int l2 = Math.abs(arr1[0]-arr3[0])*Math.abs(arr1[0]-arr3[0])+Math.abs(arr1[1]-arr3[1])*Math.abs(arr1[1]-arr3[1]);
        int l3 = Math.abs(arr4[0]-arr2[0])*Math.abs(arr4[0]-arr2[0])+Math.abs(arr4[1]-arr2[1])*Math.abs(arr4[1]-arr2[1]);
        int l4 = Math.abs(arr4[0]-arr3[0])*Math.abs(arr4[0]-arr3[0])+Math.abs(arr4[1]-arr3[1])*Math.abs(arr4[1]-arr3[1]);
        int l5 = Math.abs(arr1[0]-arr4[0])*Math.abs(arr1[0]-arr4[0])+Math.abs(arr1[1]-arr4[1])*Math.abs(arr1[1]-arr4[1]);
        int l6 = Math.abs(arr2[0]-arr3[0])*Math.abs(arr2[0]-arr3[0])+Math.abs(arr2[1]-arr3[1])*Math.abs(arr2[1]-arr3[1]);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        if(l1==l2 && l3==l4 && l1==l3 && l5==l6){
            return true;
        }else{
            return false;
        }

    }
}

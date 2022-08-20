package com.tkx.java.热点题目;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月08日 17:21
 */
public class 根据身高重建队列 {
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        reconstructQueue(people);
    }
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            return a[0]!=b[0]?b[0]-a[0]:a[1]-b[1];
        });
        List<int[]> list = new LinkedList<>();
        for(int i=0;i<people.length;i++){
            list.add(people[i][1],people[i]);
        }
        return list.toArray(new int[list.size()][2]);
    }
}

package com.tkx.java.秋招笔试题.美团;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月20日 10:36
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 坐标
        int[][] arr = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int[] dis = new int[3];
        for (int i = 0; i < dis.length; i++) {
            dis[i] = sc.nextInt();
        }
        // 很坐标
        List<int[]> list = new ArrayList<>();
        for (int dx = 0; dx <= dis[0]; dx++) {
            int x1 = arr[0][0] + dx;
            int x2 = arr[0][0] - dx;
            int y1 = arr[0][1] + (dis[0] - dx);
            int y2 = arr[0][1] - (dis[0] - dx);
            if (x1 >= 1 && x1 <= n && y1 >= 1 && y1 <= n) {
                list.add(new int[]{x1, y1});
            }
            if (x1 >= 1 && x1 <= n && y2 >= 1 && y2 <= n) {
                list.add(new int[]{x1, y2});
            }
            if (x2 >= 1 && x2 <= n && y1 >= 1 && y1 <= n) {
                list.add(new int[]{x2, y1});
            }
            if (x2 >= 1 && x2 <= n && y2 >= 1 && y2 <= n) {
                list.add(new int[]{x2, y2});
            }
        }
        list.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(int i=0;i<list.size();i++){
            int a = list.get(i)[0];
            int b = list.get(i)[1];
            int d2 = Math.abs(a-arr[1][0])+Math.abs(b-arr[1][1]);
            int d3 = Math.abs(a-arr[2][0])+Math.abs(b-arr[2][1]);
            if(d2==dis[1] && d3==dis[2]){
                System.out.println(a+" "+b);
                break;
            }
        }
    }
}



package com.tkx.java.help;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月24日 16:36
 */
public class Test {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.hashCode());
        s = "world";
        System.out.println(s.hashCode());
    }
    static  boolean f = false;
    public static int[][] ballGame(int num, String[] plate) {
        List<List<Integer>> list = new ArrayList<>();
        int m = plate.length;
        int n = plate[0].length();
        char[][] cs = new char[m][n];
        for (int i = 0; i < plate.length; i++) {
            for (int j = 0; j < plate[i].length(); j++) {
                cs[i][j] = plate[i].charAt(j);
            }
        }
        List<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                f = false;
                if (i == 0 && j != 0 && j != n - 1) {
                    dfs(i, j, 1, cs, num);
                } else if (i == m - 1 && j != 0 && j != n - 1) {
                    dfs(i, j, 0, cs, num);
                } else if (j == 0 && i != 0 && i != m - 1) {
                    dfs(i, j, 3, cs, num);
                } else if (j == n - 1 && i != 0 && i != m - 1) {
                    dfs(i, j, 2, cs, num);
                }
                if (f) {
                    tmp.add(new int[]{i, j});
                }
            }
        }
        System.out.println(tmp);
        return null;
    }

    public static void dfs(int x, int y, int dir, char[][] cs, int num) {
        if(num<0){
            return;
        }
        if (x < 0 || y < 0 || x >= cs.length || y >= cs[0].length) {
            f = true;
            return;
        }
        // 逆时针旋转
        if(cs[x][y]=='W'){
            //上
            if(dir==0) dir = 2;
            if(dir==1) dir = 3;
            if(dir==2) dir = 1;
            if(dir==3) dir = 0;
        }
        if(cs[x][y] =='E'){
            if(dir==0) dir = 3;
            if(dir==1) dir = 2;
            if(dir==2) dir = 0;
            if(dir==3) dir = 1;
        }
        if(cs[x][y]=='O'){
            return;
        }
        if (dir == 0) {
            dfs(x - 1, y, dir, cs, num-1);
        }
        if (dir == 1) {
            dfs(x + 1, y, dir, cs, num-1);
        }
        if (dir == 2) {
            dfs(x, y - 1, dir, cs, num-1);
        }
        if (dir == 3) {
            dfs(x, y + 1, dir, cs, num-1);
        }
    }

}

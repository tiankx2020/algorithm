package com.tkx.java.秋招笔试题.携程;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3模板答案 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String color = '0' + s;
        boolean[][] grad = new boolean[n + 1][n + 1];
        int t = n - 1;
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int min = a < b ? a : b;
            int max = a > b ? a : b;
            grad[min][max] = true;
        }
        List<int[]> edges = new ArrayList<>();
        //横向
        for (int i = 1; i <= n; i++) {
            int num = 0;
            int[] e = new int[2];
            for (int j = i + 1; j <= n; j++) {
                if (grad[i][j]) {
                    num++;
                    e[0] = i;
                    e[1] = j;
                }
            }
            if (num == 1) edges.add(e);
        }
        //纵向
        for (int i = 1; i <= n; i++) {
            int num = 0;
            int[] e = new int[2];
            for (int j = 0; j <= i; j++) {
                if (grad[j][i]) {
                    num++;
                    e[0] = j;
                    e[1] = i;
                }
            }
            if (num == 1) {
                int h = e[0];
                int num2 = 0;
                for (int k = h + 1; k <= n; k++) {
                    if (grad[h][k]) num2++;
                }
                if (num2 > 1) {
                    edges.add(e);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < edges.size(); i++) {
            int[] es = edges.get(i);
            if (isValid(es[0], es[1], color, grad)) res++;
        }
        System.out.println(res);

    }

    public static boolean isValid(int l, int r, String color, boolean[][] grad) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        grad[l][r] = false;
        left = getRoads(l, grad, left);
        left.add(l);
        right = getRoads(r, grad, right);
        right.add(r);
        grad[l][r] = true;
        boolean R1 = false, G1 = false, B1 = false;
        boolean R2 = false, G2 = false, B2 = false;
        for (int i = 0; i < left.size(); i++) {
            Integer node = left.get(i);
            char c = color.charAt(node);
            if (c == 'r') R1 = true;
            if (c == 'g') G1 = true;
            if (c == 'b') B1 = true;
        }
        for (int i = 0; i < right.size(); i++) {
            Integer node = right.get(i);
            char c = color.charAt(node);
            if (c == 'r') R2 = true;
            if (c == 'g') G2 = true;
            if (c == 'b') B2 = true;
        }
        if (R1 && R2 && G1 && G2 && B1 && B2) return true;
        else return false;
    }

    public static List<Integer> getRoads(int start, boolean[][] grad, List<Integer> roads) {
        for (int i = start + 1; i < grad.length; i++) {
            if (grad[start][i]) {
                roads.add(i);
                grad[start][i] = false;
                getRoads(i, grad, roads);
                grad[start][i] = true;
            }
        }
        for (int i = 1; i < start; i++) {
            if (grad[i][start]) {
                roads.add(i);
                grad[i][start] = false;
                getRoads(i, grad, roads);
                grad[i][start] = true;
            }
        }
        return roads;
    }
}

package com.tkx.java.help.奇安信;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月15日 20:21
 */
public class T2 {
    public static void main(String[] args) {
        int[][] points = {{0,1},{0,2},{0,3}};
        int minLen = getMinLen(points);
        System.out.println(minLen);
    }
    public static int getMinLen(int[][] points) {
        int n = points.length;
        int[][] pos = new int[n][n];
        // 计算出各节点之间的距离
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                int x = Math.abs(points[i][0] - points[j][0]);
                int y = Math.abs(points[i][1] - points[j][1]);
                pos[i][j] = x+y;
            }
        }
        int cur = 0;
        int step = 0;
        int res = 0;
        int next = 0;
        boolean[] v = new boolean[points.length];
        int minDis = points[0][0] + points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] + points[i][1] < minDis) {
                minDis = points[i][0] + points[i][1];
                next = i;
            }
        }
        step++;
        res += points[next][0] + points[next][1];
        cur = next;
        v[cur] = true;
        while (step < points.length) {
            // 找出最小的
            next = -1;
            minDis = Integer.MAX_VALUE;
            for (int i = 0; i < points.length; i++) {
                if(v[i]==false && pos[i][cur]<minDis){
                    minDis =  pos[i][cur];
                    next = i;
                }
            }
            v[next] = true;
            res+=pos[cur][next];
            cur = next;
            step++;
        }
        return  res;
    }
}

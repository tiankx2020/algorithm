package com.tkx.java.每日一题;

/**
 * @Author tkx
 * @Date 2024 03 05
 **/
public class T1976 {
    int mod = 1000000007;
    boolean[] visit;
    int maxN;
    int minStep = Integer.MAX_VALUE;
    int res = 0;

    public int countPaths(int n, int[][] roads) {
        maxN = n;
        visit = new boolean[n];
        dfs(0,roads,0);
        return res;
    }

    /**
     * @param index
     * @param roads
     * @param step  表示走得步数
     */
    public void dfs(int index, int[][] roads, int step) {
        // 表示被访问到了
        if (step > minStep) return;

        if (index == maxN - 1) {
            if (step < minStep) {
                minStep = step;
                res = 1;
            } else if (step == minStep) {
                res++;
            }
        }
        for (int i = 0; i < roads.length; i++) {
            int a = roads[i][0];
            int b = roads[i][1];
            int time = roads[i][2];
            if (a == index && visit[b]==false){
                visit[index] = true;
                dfs(b,roads,step+time);
                visit[index] = false;
            } else if(b==index && visit[a] == false){
                visit[index] = true;
                dfs(a,roads,step+time);
                visit[index] = false;
            }
        }
        visit[index] = false;
    }
}

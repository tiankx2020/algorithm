package com.tkx.java.笔试题.奇安信;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月25日 19:39
 */
public class T1 {
    int res = 0;
    public int DagPathNum (int[][] nodes) {
        // write code here
        dfs(nodes,0);
        return res;
    }

    public void dfs(int[][] nodes,int index){
        if(index==nodes.length-1){
            res++;
        }
        for(int i=0;i<nodes[index].length;i++){
            dfs(nodes,nodes[index][i]);
        }
    }
}

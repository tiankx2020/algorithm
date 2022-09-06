package com.tkx.java.秋招笔试题.redbook;
import java.util.*;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月04日 17:06
 */
public class T3 {
    static int res = Integer.MAX_VALUE;
    static boolean v[];
    static Map<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n个城市
        int m = sc.nextInt(); // m条道路
        int k = sc.nextInt(); // 一天最多走多长路
        int[] a = new int[m];
        int[] b = new int[m];
        int[] w = new int[m];
        v = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            w[i] = sc.nextInt();
        }
        List<Integer>[] path = new List[n+1];
        for (int i = 0; i < path.length; i++) {
            path[i] = new ArrayList<>();
        }
        for(int i=0;i<a.length;i++){
            int start = a[i];
            int end = b[i];
            path[start].add(end);
            path[end].add(start);
            map.put(start+","+end,w[i]);
            map.put(end+","+start,w[i]);
        }
        dfs(1,path,k,0,n);
        System.out.println(res);

    }

    public static void dfs(int index,List<Integer>[] path,int k,int count,int n){
        v[index]=true;
        if(index==n){
            res = Math.min(res,count);
            v[index] = false;
            return;
        }
        if(k==0) {
            v[index] = false;
            return;
        }
        for (int i = 0; i < path[index].size(); i++) {
            int d = path[index].get(i);
            // d没有被访问到
            if(v[d]==false&&map.get(index+","+d)<res){
                // count更新
                dfs(d,path,k-1,Math.max(count,map.get(index+","+d)),n);
            }
        }
        v[index] = false;
    }
}

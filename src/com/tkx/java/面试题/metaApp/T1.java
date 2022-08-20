package com.tkx.java.面试题.metaApp;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月10日 10:37
 */
public class T1 {
    public static void main(String[] args) {
        List<List<Integer>> method = method(15);
        for (List<Integer> list : method) {
            System.out.println(list);
        }
    }
    static List<List<Integer>>  ans;
    static List<Integer> tmp=new LinkedList<>();
    public static List<List<Integer>> method(int n){
        ans = new LinkedList<>();
        dfs(1,n,0);
        return ans;
    }

    public static void dfs(int index,int n,int sum){
        if(index>n+1) return;
        if(n==sum) {
            ans.add(new LinkedList<>(tmp));
        }
        tmp.add(index);
        dfs(index+1,n,sum+index);
        tmp.remove(tmp.size()-1);
        dfs(index+1,n,sum);
    }
}


package com.tkx.java.秋招笔试题.byteDance;

import java.util.*;

/***
 * 拓扑排序
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String[] s1 = sc.nextLine().split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(s1[i]);
        }
        List<int[]> tmp = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            int a = Integer.valueOf(s[0]);
            for(int j=1;j<s.length;j++){
                int b = Integer.valueOf(s[j]);
                tmp.add(new int[]{a,b});
            }
        }
        int[][] preArr =  new int[tmp.size()][2];
        for(int i=0;i< preArr.length;i++){
            preArr[i] = tmp.get(i);
        }
        int[] res = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            res[i]= method01(arr[i],preArr);
        }
        for (int re : res) {
            System.out.print(re+" ");
        }

    }

    public static int method01(int index, int[][] preArr) {
        //记录入度为0的节点
        Queue<Integer> queue = new ArrayDeque<>();
        //入度数量  依赖什么
        int[] indegre = new int[index+100];
        //出度元素   被依赖
        List<Integer>[] lists = new List[index+100];

        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<Integer>();
        }

        int num = 0;
        for (int[] arr : preArr) {
            //入度加1
            indegre[arr[0]]++;
            lists[arr[1]].add(arr[0]);
        }

        for (int i = 0; i < indegre.length; i++) {
            if (indegre[i] == 0) {
                queue.add(i);
            }
        }
        while (queue.size() > 0) {
            int tmp = queue.poll();
            num++;
            for (int x : lists[tmp]) {
                indegre[x]--;
                if (indegre[x] == 0) {
                    queue.add(x);
                }
            }
        }
        if(num== index){
            return 1;
        }else{
            return  0;
        }
    }
}

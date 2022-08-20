package com.tkx.java.笔试题.耀乘健康;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月01日 11:13
 */
public class T2 {
    public int NumOfTriangle (int[] edges) {
        // write code here
        Arrays.sort(edges);
        Set<String> set = new HashSet<>();
        for(int i=0;i<edges.length;i++){
            for(int j=i+1;j<edges.length;j++){
                for(int k=j+1;k<edges.length;k++){
                    int a = edges[i],b=edges[j],c=edges[k];
                    if(a+b>c && a+c>b && c+b>a){
                        set.add(a+","+b+","+c);
                    }
                }
            }
        }
        return set.size();
    }
}

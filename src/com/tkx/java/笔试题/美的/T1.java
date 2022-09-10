package com.tkx.java.笔试题.美的;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月09日 19:23
 */
public class T1 {
    public int maxPointsNum (Point[] points) {
        // write code here
        if(points == null) return 0;
        if(points.length<3){
            return  points.length;
        }
        int i,j;
        double k ;
        int ans = 0;
        for( i=0;i<points.length;i++){
            int same = 0;
            int v = 1;
            int count = 1;
            Map<Double,Integer> map = new HashMap<>();
            for(j=i+1;j<points.length;j++){
                if(points[i].x==points[j].x && points[i].y==points[j].y)
                    same++;
                else if(points[i].x==points[j].x && points[i].y!=points[j].y){
                    v++;
                    count = Math.max(count, v);
                }else{
                    double ddy = points[j].y-points[i].y;
                    double ddx = points[j].x-points[i].x;
                    k = ddy / ddx +0.0;
                    if(map.get(k)==null){
                        map.put(k,2);
                    }else{
                        map.put(k, map.get(k)+1);
                    }
                    count = Math.max(count, map.get(k));
                }
            }
            ans = Math.max(ans, count +same);
        }
        return ans;
    }
}


 class Point {
  int x;
  int y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

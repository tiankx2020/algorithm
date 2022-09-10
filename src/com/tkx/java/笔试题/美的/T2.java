package com.tkx.java.笔试题.美的;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月09日 19:33
 */
public class T2 {

    public int maxPointsNum (Point[] points) {
        // write code here
        int[][] ps = new int[points.length][2];
        for(int i=0;i<points.length;i++){
            ps[i][0] = points[i].x;
            ps[i][1] = points[i].y;
        }
        int res = maxPoints(ps);
        return  res;
    }


    public int maxPoints(int[][] ps) {
        int res = 1;
        int l = ps.length;
        if(l == 1){
            return res;
        }
        for(int i = 0; i< l; i++)
            for(int j = i+1; j< l; j++){
                int t = 2;
                for(int k = j+1; k< l; k++){
                    if((ps[k][1]- ps[j][1])*(ps[j][0]- ps[i][0])==
                            (ps[k][0]- ps[j][0])*(ps[j][1]- ps[i][1])){
                        t++;
                    }
                }
                res = Math.max(t, res);
            }
        return res;
    }

}

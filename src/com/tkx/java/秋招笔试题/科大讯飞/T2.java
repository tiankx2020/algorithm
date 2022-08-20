package com.tkx.java.秋招笔试题.科大讯飞;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年08月06日 19:40
 */
public class T2 {
    public long getArea (Point p1, Point p2, Point p3, Point p4) {
        // write code here
      long ans = 0L;
      double s1 = getAngleArea(p1,p2,p3);
      double s2= getAngleArea(p1,p4,p4);
      return (long)(s1+s2);
    }
    public double getAngleArea(Point p1,Point p2,Point p3){
      double a = Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
      double b = Math.sqrt((p1.x-p3.x)*(p1.x-p3.x)+(p1.y-p3.y)*(p1.y-p3.y));
      double c = Math.sqrt((p3.x-p2.x)*(p3.x-p2.x)+(p3.y-p2.y)*(p3.y-p2.y));
      double p = (a+b+c)/2;
      return Math.sqrt(p*(p-a)*(p-b)*(p-c));
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

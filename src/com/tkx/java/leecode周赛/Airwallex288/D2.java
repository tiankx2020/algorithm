package com.tkx.java.leecode周赛.Airwallex288;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月10日 10:45
 */
public class D2 {
    public static void main(String[] args) {
        String s=  "999+999";
        System.out.println(minimizeResult(s));
    }
    public static String minimizeResult(String expression) {
        int min = Integer.MAX_VALUE;
        String s1=expression.split("\\+")[0];
        String s2=expression.split("\\+")[1];
        StringBuilder sb=null;
        for(int i=0;i<s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                String t1 = s1.substring(0,i);
                String t2 = s1.substring(i);
                String t3 = s2.substring(0,j);
                String t4 = s2.substring(j);
                int a,b,c,d;
                a = t1.length()==0?1:Integer.valueOf(t1);
                d = t4.length()==0?1:Integer.valueOf(t4);
                b =Integer.valueOf(t2);
                c =Integer.valueOf(t3);
                if(a*(b+c)*d <min){
                    min = a*(b+c)*d;
                    sb = new StringBuilder();
                    sb.append(t1);
                    sb.append('(');
                    sb.append(t2);
                    sb.append('+');
                    sb.append(t3);
                    sb.append(')');
                    sb.append(t4);

                }
            }
        }
        return sb.toString();
    }
}

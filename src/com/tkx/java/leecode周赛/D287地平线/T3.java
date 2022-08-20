package com.tkx.java.leecode周赛.D287地平线;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月03日 10:48
 */
public class T3 {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for (int candy : candies) {
            sum+=candy;
        }
        int min = (int)(sum/k);
        int l=-1,r=min+1;
        boolean f =false;
        while(l+1!=r){
            int mid = (l+r)/2;
            if(mid==0){
                f=true;
                break;
            }
            long tmp = 0;
            for (int candy : candies) {
                tmp+=(candy/mid);
            }
            //找到最后一个符合要求的
            if(tmp>=k){
                l=mid;
            }else{
                r=mid;
            }
        }
        if(f==true){
            if(sum>=k) return 1;
            else return 0;
        }
        return l;
    }
}

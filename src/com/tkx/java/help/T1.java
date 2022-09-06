package com.tkx.java.help;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月02日 15:55
 */
public class T1 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,1};
        int solution = solution(arr);
        System.out.println(solution);
    }

    public static int solution(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                res++;
                for(int j=i;j<arr.length;j++){
                    arr[j] = 1-arr[j];
                }
            }
        }
        return res;
    }
}

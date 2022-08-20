package com.tkx.java.笔试题.精灵云笔试;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月26日 19:27
 */
public class T2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int[] arr = {0,1 ,2,4,8, 199,257 ,258, 546, 1002,15511};
        // int x = 258;

        // int[] arr = {0,1,2,4,8,199,257 ,352,352,352,352,546, 1002,15511};
        // int x = 352;
        // System.out.println(getLast(arr,x));
    }

    //核心代码
    //算法思想

    /**
      使用二分查找
      如果arr[mid]>x ,说明要查找的元素在右边 r=mid-1;
      如果arr[mid]<x,  说明要查找的元素在左边 l=mid+1;
      如果arr[mid]==x, 因为要查找最后一个等于x的元素下标，所以l右移到mid的位置

     //最后判断arr[l]是否等于x,相等说明找到了返回l,不等说明没有找到返回-1;
     */
    public static int getLast(int[] arr, int x){
        int l=0,r=arr.length-1;
        while (l<r){
            int mid = (l+r)/2;
            if(arr[mid]<x){
                l=mid+1;
            }else if(arr[mid]>x){
                r=mid-1;
            }else {
                l=mid;
            }
        }
        if(arr[l]==x) return l;
        else return  -1;
    }
}

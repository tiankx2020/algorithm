package com.tkx.java.leecode周赛.D289;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月17日 10:30
 */
public class T3 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        int[][] arr = {{23,17,15,3,20},{8,1,20,27,11},{9,4,6,2,21},{40,9,1,10,6},{22,7,4,5,3}};
        t3.maxTrailingZeros(arr);
    }
    public int maxTrailingZeros(int[][] grid) {
        int ans = 0;
        int m = grid.length, n = grid[0].length;
        int[][][] arr = new int[m][n][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = grid[i][j];
                while (tmp % 2 == 0) {
                    arr[i][j][0]++;
                    tmp /= 2;
                }
                tmp = grid[i][j];
                while (tmp % 5 == 0) {
                    arr[i][j][1]++;
                    tmp /= 5;
                }
            }
        }
        int[][][] up = new int[m][n][2];
        int[][][] down = new int[m][n][2];
        int[][][] left = new int[m][n][2];
        int[][][] right = new int[m][n][2];

        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                up[i][j][0]+=up[i-1][j][0]+arr[i-1][j][0];
                up[i][j][1]+=up[i-1][j][1]+arr[i-1][j][1];
            }
        }
        for(int i=m-2;i>=0;i--){
            for(int j=0;j<n;j++){
                down[i][j][0]+=down[i+1][j][0]+arr[i+1][j][0];
                down[i][j][1]+=down[i+1][j][1]+arr[i+1][j][1];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                left[i][j][0]+=left[i][j-1][0]+arr[i][j-1][0];
                left[i][j][1]+=left[i][j-1][1]+arr[i][j-1][1];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=n-2;j>=0;j--){
                right[i][j][0]+=right[i][j+1][0]+arr[i][j+1][0];
                right[i][j][1]+=right[i][j+1][1]+arr[i][j+1][1];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int arr1= Math.min(up[i][j][0]+left[i][j][0]+arr[i][j][0],up[i][j][1]+left[i][j][1]+arr[i][j][1]);
                int arr2= Math.min(up[i][j][0]+right[i][j][0]+arr[i][j][0],up[i][j][1]+right[i][j][1]+arr[i][j][1]);
                int arr3= Math.min(down[i][j][0]+left[i][j][0]+arr[i][j][0],down[i][j][1]+left[i][j][1]+arr[i][j][1]);
                int arr4= Math.min(down[i][j][0]+right[i][j][0]+arr[i][j][0],down[i][j][1]+right[i][j][1]+arr[i][j][1]);
                ans = Math.max(ans,Math.max(arr1,arr2));
                ans = Math.max(ans,Math.max(arr4,arr3));
            }
        }
        return ans;
    }
}

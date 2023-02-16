package com.tkx.java.leecodeHot100;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月31日 15:15
 */
public class _48旋转图像 {
    public void rotate(int[][] matrix) {
        // 先沿着X轴做对称操作
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int[] tmp = new int[n];
            tmp = matrix[i];
            matrix[i] = matrix[n - i - 1];
            matrix[n - i - 1] = tmp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}

package com.tkx.java.剑指offer.搜索和回溯;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月11日 21:21
 */
public class 单词搜索 {

    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, int index, String word) {
        if (index == word.length()) return true;
        if (i < 0 || i >= board.length) return false;
        if (j < 0 || j >= board[0].length) return false;
        if (board[i][j] == '.' || board[i][j] != word.charAt(index)) return false;
        //表示已经遍历过了，不能重复访问
        board[i][j] = '.';
        boolean f1 = dfs(board, i + 1, j, index + 1, word);
        boolean f2 = dfs(board, i - 1, j, index + 1, word);
        boolean f3 = dfs(board, i, j + 1, index + 1, word);
        boolean f4 = dfs(board, i, j - 1, index + 1, word);
        //回溯，
        board[i][j] = word.charAt(index);
        return f1 || f2 || f3 || f4;
    }
}

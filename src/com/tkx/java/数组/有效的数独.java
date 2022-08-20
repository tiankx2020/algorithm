package com.tkx.java.数组;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月03日 21:34
 */
public class 有效的数独 {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        //先判断行是否满足要求
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
            set.clear();
        }
        //再判断列是否满足要求
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(set.contains(board[j][i])) return false;
                    set.add(board[j][i]);
                }
            }
            set.clear();
        }
        //再判断块是否满足要求
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                for(int i1=i;i1<=i+2;i1++){
                    for(int j1=j;j1<=j+2;j1++){
                        if(board[i1][j1]!='.'){
                            if(set.contains(board[i1][j1])) return false;
                            set.add(board[i1][j1]);
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}

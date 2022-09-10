package com.tkx.java.笔试题.腾讯音乐;

import com.tkx.java.剑指offer.TreeNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年09月08日 19:07
 */
public class T3 {


    public int getTreeSum(TreeNode tree) {
        long res = get(tree);
        return  (int)res%1000000007;
    }

    public long get(TreeNode tree){
        // if (tree == null) return 0;
        // if (tree.left != null) {
        //     long  left = getTreeSum(tree.left);
        //     long right = getTreeSum(tree.right);
        //     long max = Math.max(left,right);
        //     max = max *2 +1;
        //     return max;
        // } else {
        //     return 1;
        // }
        int height= getHeight(tree);
        long w = (long)Math.pow(2,height)-1;
        return (int)w%1000000007;
    }

    public int getHeight(TreeNode treeNode){
        if(treeNode==null) return 0;
        int left = getTreeSum(treeNode.left);
        int right = getTreeSum(treeNode.right);
        return Math.max(left,right)+1;
    }
}

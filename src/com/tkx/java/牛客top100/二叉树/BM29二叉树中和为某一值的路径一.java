package com.tkx.java.牛客top100.二叉树;

import com.tkx.java.剑指offer.TreeNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年05月17日 23:01
 */
public class BM29二叉树中和为某一值的路径一 {
    int count = 0;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root != null) {
            count += root.val;
            if (root.left == null && root.right == null && count == sum) {
                return true;
            }
            boolean l = hasPathSum(root.left, sum);
            if(l){
                count-=root.val;
                return true;
            }
            boolean r = hasPathSum(root.right, sum);
            if(r){
                count-=root.val;
                return true;
            }
        }
        return false;
    }
}

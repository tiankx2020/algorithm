package com.tkx.java.leecode模拟面试;

import javax.swing.tree.TreeNode;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月14日 10:50
 */
public class T1 {
    public TreeNode invertTree(TreeNode root) {
        // postOrder(root);
        return root;
    }

    // public void postOrder(TreeNode root){
    //     if(root!=null){
    //         postOrder(root.left);
    //         postOrder(root.right);
    //         TreeNode tmp = root.left;
    //         root.left = root.right;
    //         root.right = tmp;
    //     }
    // }
}

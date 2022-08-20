package com.tkx.java.热点题目;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月13日 11:11
 */
public class 合并二叉树 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
        TreeNode tmp = new TreeNode(root1.val+root2.val);
        tmp.left = mergeTrees(root1.left,root2.left);
        tmp.right = mergeTrees(root1.right,root2.right);
        return tmp;
    }

}

package com.tkx.java.热点题目;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月11日 16:03
 */
public class 二叉树的直径 {
    //求二叉树的直径，就是求每个节点的左右子树的高度个
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return ans;
    }

    public int getHeight(TreeNode root){
        if(root==null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        ans = Math.max(ans,left+right);
        return Math.max(left,right)+1;
    }

}

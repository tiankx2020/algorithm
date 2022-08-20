package com.tkx.java.热点题目;


import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年04月06日 20:05
 */
public class 打家劫舍III {
    class Solution {
        Map<TreeNode,Integer> map = new HashMap<>();
        public int rob(TreeNode root) {
            if(root==null) return 0;
            if(map.containsKey(root)) return map.get(root);
            int val = root.val;
            if(root.left!=null){
                val+=rob(root.left.left)+rob(root.left.right);
            }
            if(root.right!=null){
                val+=rob(root.right.left)+rob(root.right.left);
            }
            int val2 = rob(root.left)+rob(root.right);
            int max = Math.max(val2, val);
            map.put(root,max);
            return max;
        }


    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

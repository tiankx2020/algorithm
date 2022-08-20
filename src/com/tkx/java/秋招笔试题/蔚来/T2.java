package com.tkx.java.秋招笔试题.蔚来;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T2 {
    static int ans = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vals = new int[n];
        int[] relation = new int[n];
        Map<Integer, TreeNode> map = new HashMap<>();
        for (int i = 0; i < vals.length; i++) {
            vals[i] = sc.nextInt();
            TreeNode treeNode = new TreeNode(vals[i]);
            map.put(i + 1, treeNode);
        }
        TreeNode root = null;
        for (int i = 0; i < relation.length; i++) {
            int parentIndex = sc.nextInt();
            if (parentIndex > 0) {
                TreeNode parent = map.get(parentIndex);
                TreeNode node = map.get(i + 1);
                if (parent.left == null) {
                    parent.left = node;
                } else {
                    parent.right = node;
                }
            } else {
                root = map.get(i + 1);
            }
        }
        postOrder(root);
        if(ans==Integer.MIN_VALUE) System.out.println(0);
        System.out.println(ans);
    }

    public static int  postOrder(TreeNode node) {
        if (node != null) {
            int leftVal = postOrder(node.left);
            int rightVal = postOrder(node.right);
            int val = Math.max(0,Math.max(leftVal+node.val,rightVal+node.val));
            val = Math.max(val,leftVal+rightVal+node.val);
            ans = Math.max(ans,val);
            return val;
        }else{
            return 0;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

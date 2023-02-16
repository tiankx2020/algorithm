package com.tkx.java.笔试题.欧克云链;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月22日 15:52
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n + 1];
        Map<Integer, TreeNode> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
        }
        TreeNode root = null;
        for (int i = 1; i <= n; i++) {
            int parent = sc.nextInt();
            TreeNode treeNode = new TreeNode(v[i]);
            map.put(i, treeNode);
            if (parent == 0) {
                root = treeNode;
            }else{
                TreeNode p = map.get(parent);
                if (p.left == null) {
                    p.left = treeNode;
                } else {
                    p.right = treeNode;
                }
            }

        }
//         int res = rob(root);
//         System.out.println(res);
        preOrder(root);
//         System.out.println(root.val);
    }
    public static void preOrder(TreeNode node){
        if(node!=null){
            System.out.println(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    static Map<TreeNode, Integer> map = new HashMap<>();

    public static int rob(TreeNode root) {
        if (root == null) return 0;
        if (map.containsKey(root)) return map.get(root);
        int val = root.val;
        if (root.left != null) {
            val += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            val += rob(root.right.right) + rob(root.right.left);
        }
        int val2 = rob(root.left) + rob(root.right);
        int max = Math.max(val2, val);
        map.put(root, max);
        return max;
    }


}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int val) {
        this.val = val;
    }
}

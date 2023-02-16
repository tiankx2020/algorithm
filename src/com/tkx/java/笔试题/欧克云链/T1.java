package com.tkx.java.笔试题.欧克云链;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年10月22日 15:37
 */
class T1 {

    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if (l != null && r != root) {
            ans = root;
        }
        if ((l != null || r != null) && (root.val == p.val || root.val == q.val)){
            ans = root;
        }
        if(l!=null || r!=null || root.val == q.val || root.val == p.val){
            return root;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String pStr = scanner.nextLine();
        String qStr = scanner.nextLine();
        String arrayStr = inputStr.substring(1, inputStr.lastIndexOf("]"));
        String[] arrayStrArray = arrayStr.split(",");
        Integer[] array = new Integer[arrayStrArray.length];
        for (int i = 0; i < arrayStrArray.length; i++) {
            if ("null".equals(arrayStrArray[i])) {
                continue;
            }
            array[i] = Integer.valueOf(arrayStrArray[i]);
        }
        Input input = new Input();
        String nodeStr = inputStr.substring(inputStr.lastIndexOf("]"));
        String[] nodeStrArray = nodeStr.split(",");
        input.pVal = Integer.parseInt(pStr);
        input.qVal = Integer.parseInt(qStr);
        TreeNode root = createTree(0, array, input);
        input.root = root;
        TreeNode treeNode = new T1().lowestCommonAncestor(input.root, input.p, input.q);
        System.out.println(treeNode.val);
    }

    static TreeNode createTree(int rootIndex, Integer[] values, Input input) {
        if (rootIndex >= values.length) {
            return null;
        }
        if (values[rootIndex] == null) {
            return null;
        }
        TreeNode rootNode = new TreeNode();
        rootNode.val = values[rootIndex];
        rootNode.left = createTree(2 * rootIndex + 1, values, input);
        rootNode.right = createTree(2 * rootIndex + 2, values, input);
        if (rootNode.val == input.pVal) {
            input.p = rootNode;
        } else if (rootNode.val == input.qVal) {
            input.q = rootNode;
        }
        return rootNode;
    }

    static class Input {
        TreeNode root;
        TreeNode p;
        TreeNode q;

        int pVal;

        int qVal;
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
    }
}

package me.sofiworker.leetcode.no100;

/**
 * @author sofiworker
 * @date 2020/9/15
 */
public class Solution {

     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
     }


    public boolean isSameTree(TreeNode p, TreeNode q) {
         StringBuilder sb1 = new StringBuilder();
         StringBuilder sb2 = new StringBuilder();
         preOrder(p, sb1);
         preOrder(q, sb2);
        return new String(sb1).equals(new String(sb2));
    }

    private void preOrder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("*");
            return;
        }
        sb.append(root.val);
        preOrder(root.left, sb);
        preOrder(root.right, sb);
    }
}

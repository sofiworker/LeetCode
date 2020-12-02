package me.sofiworker.leetcode.no226;

/**
 * @author sofiworker
 * @date 2020/9/16
 */
public class Solution {
    
     static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        reverse(root.left, root.right, root);
        return root;
    }

    private void reverse(TreeNode left, TreeNode right, TreeNode temp) {
        if (temp == null) {
            return;
        }
         temp.left = right;
         temp.right = left;
        if (temp.left != null) {
            reverse(temp.left.left, temp.left.right, temp.left);
        }
        if (temp.right != null) {
            reverse(temp.right.left, temp.right.right, temp.right);
        }
    }
}

package me.sofiworker.sword.no27;

import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/8/23
 */
public class Solution {

    static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode res;
        TreeNode cur = null;
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (stack.isEmpty()) {
                stack.push(root);
                res = new TreeNode(root.val);
                cur = res;
                continue;
            }
            if (root.left != null) {
                cur.right = root.left;
                cur = root.left;
            }
            if (root.right != null) {
                cur.left = root.right;
                cur = root.right;
            }
        }
    }
}

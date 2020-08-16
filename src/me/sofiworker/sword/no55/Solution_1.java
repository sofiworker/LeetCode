package me.sofiworker.sword.no55;

/**
 * @author sofiworker
 * @date 2020/8/14
 */
public class Solution_1 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
//        return Math.max(root.left == null ? 0 : maxDepth(root.left),
//                root.right == null ? 0 : maxDepth(root.right));
        if (root == null) {
            return 0;
        }
        return max(root);
    }

    private int max(TreeNode node) {
        if (node.left != null) {
            return 1 + max(node.left);
        }
        if (node.right != null) {
            return 1 + max(node.right);
        }
        return 0;
    }
}

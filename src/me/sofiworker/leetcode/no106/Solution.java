package me.sofiworker.leetcode.no106;

/**
 * @author sofiworker
 * @date 2020/8/13
 */
public class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        int rootVal = postorder[postorder.length - 1];
        TreeNode root = new TreeNode(rootVal);
        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (rootVal == inorder[i]) {
                index = i;
                break;
            }
        }
        TreeNode last = root;
        for (int i = index; i >= 0; i -= 2) {
            if (i - 2 >= 0) {
                TreeNode node = new TreeNode(inorder[i - 2]);
                last.left = node;
                if (i - 3 >= 0) {
                    node.left = new TreeNode(inorder[i - 3]);
                }
                node.right = new TreeNode(inorder[i - 1]);
                last = node;
            }else if (i - 1 >= 0) {
                last.left = new TreeNode(inorder[i - 1]);
            }
        }
        last = root;
        for (int i = index; i < inorder.length; i += 2) {
            if (i + 2 < inorder.length) {
                TreeNode node = new TreeNode(inorder[i + 2]);
                last.right = node;
                node.left = new TreeNode(inorder[i + 1]);
                if (i + 3 <= inorder.length) {
                    node.right = new TreeNode(inorder[i + 3]);
                }
                last = node;
            }else if (i + 1 < inorder.length) {
                last.right = new TreeNode(inorder[i + 1]);
            }
        }
        return root;
    }
}

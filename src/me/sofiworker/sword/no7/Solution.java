package me.sofiworker.sword.no7;

/**
 * @author sofiworker
 * @date 2020/9/15
 */
public class Solution {

     static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null ||
                inorder.length == 0 || (preorder.length != inorder.length)) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        build(root, preorder, 1, inorder, 1);
        return root;
    }

    public void build(TreeNode curNode, int[] preOrder, int index1, int[] inOrder, int index2) {
        if (index1 == preOrder.length - 1 || index2 == inOrder.length - 1) {
            return;
        }
        TreeNode left = new TreeNode(preOrder[index1]);
        curNode.left = left;
        build(left, preOrder, index1 + 1, inOrder, index2);
        TreeNode right = new TreeNode(inOrder[index2]);
        curNode.right = right;
        build(right, preOrder, index1 + 1, inOrder, index2);
    }
}

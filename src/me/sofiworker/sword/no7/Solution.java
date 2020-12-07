package me.sofiworker.sword.no7;

import java.util.Arrays;

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
        build(root, preorder, 1, inorder, Arrays.binarySearch(inorder, preorder[0]));
        return root;
    }

    public void build(TreeNode curNode, int[] preOrder, int preIndex, int[] inOrder, int inIndex) {
         if (preIndex == inIndex) {
             return;
         }
        TreeNode leftNode = new TreeNode(preOrder[preIndex]);
        curNode.left = leftNode;
        build(leftNode, preOrder, preIndex++, inOrder, inIndex);

        TreeNode rightNode = new TreeNode(preOrder[preIndex]);
        curNode.right = rightNode;
        build(rightNode, preOrder, preIndex, inOrder, inIndex);
    }
}

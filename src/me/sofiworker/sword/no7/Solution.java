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
        // TODO: 2020/12/11 构建树
        if (preIndex == inIndex) {
            return;
        }
        TreeNode leftNode = new TreeNode(preOrder[preIndex]);
        curNode.left = leftNode;
        // 构建左子树
        build(leftNode, preOrder, preIndex++, inOrder, inIndex);

        TreeNode rightNode = new TreeNode(preOrder[preIndex]);
        curNode.right = rightNode;
        // 构建右子树
        build(rightNode, preOrder, preIndex, inOrder, inIndex);
    }

    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if (n == 0) {
            return null;
        }
        int rootVal = preorder[0], rootIndex = 0;
        for (int i = 0; i < n; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootIndex), Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, n), Arrays.copyOfRange(inorder, rootIndex + 1, n));

        return root;
    }
}

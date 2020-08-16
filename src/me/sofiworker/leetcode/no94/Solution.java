package me.sofiworker.leetcode.no94;

import java.util.*;

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

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        infixOrder(root);
        return result;
    }

    private final List<Integer> result = new ArrayList<>();

    private void infixOrder(TreeNode node) {
        if (node.left != null) {
            infixOrder(node.left);
        }
        result.add(node.val);
        if (node.right != null) {
            infixOrder(node.right);
        }
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List <Integer> res = new ArrayList <> ();
        Stack <TreeNode> stack = new Stack <> ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node2.left = node4;
        node2.right = node5;
        node1.right = node3;
        node3.left = node6;
        node5.left = node7;
        System.out.println(new Solution().inorderTraversal2(node1));
    }
}

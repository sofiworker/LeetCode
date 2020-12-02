package me.sofiworker.sword.no54;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sofiworker
 * @date 2020/9/17
 */
public class Solution {

     static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
    }

    public int kthLargest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }
        inOrder(root);
        return list.get(list.size() - k);
    }

    private final List<Integer> list = new ArrayList<>();

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inOrder(root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            inOrder(root.right);
        }
    }
}

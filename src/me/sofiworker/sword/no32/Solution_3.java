package me.sofiworker.sword.no32;

import java.util.*;

/**
 * @author sofiworker
 * @date 2020/9/16
 */
public class Solution_3 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        boolean isToRight = true;
        while (!deque.isEmpty()) {
            if (isToRight) {
                TreeNode poll = deque.poll();
                deque.addLast(poll.left);
                deque.addLast(poll.right);
                isToRight = false;
            }else {
                TreeNode poll = deque.pollLast();
                deque.addLast(poll.left);
                deque.addLast(poll.right);
                isToRight = true;
            }
        }
        return result;
    }
}

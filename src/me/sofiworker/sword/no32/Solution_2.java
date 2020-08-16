package me.sofiworker.sword.no32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author sofiworker
 * @date 2020/8/13
 */
public class Solution_2 {

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
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> resultList = new ArrayList<>();
        int count = 1;
        int tempCount = 0;
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
//            for (int i = 0; i < count; i++) {
//                TreeNode node = queue.poll();
//                temp.add(node.val);
//                if (node.left != null) {
//                    queue.add(node.left);
//                    tempCount++;
//                }
//                if (node.right != null) {
//                    queue.add(node.right);
//                    tempCount++;
//                }
//            }
//            count = tempCount;
//            tempCount = 0;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            resultList.add(temp);
        }
        return resultList;
    }
}

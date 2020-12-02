package me.sofiworker.sword.no55;

import java.util.LinkedList;
import java.util.Queue;

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
        if(root == null) {
            return 0;
        }
        int nLeft = maxDepth(root.left);
        int nRight = maxDepth(root.right);
        return nLeft > nRight ? nLeft + 1 : nRight + 1;
    }

    public int maxDepth1(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while(!queue.isEmpty()){
            int curSize = queue.size();
            for(int i = 0; i < curSize; i++){
                TreeNode temp = queue.poll();
                if(temp.left != null) {
                    queue.add(temp.left);
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }
            depth++;
        }
        return depth;
    }
}

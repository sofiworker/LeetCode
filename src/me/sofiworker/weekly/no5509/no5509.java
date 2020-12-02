package me.sofiworker.weekly.no5509;

import java.util.*;

/**
 * @author sofiworker
 * @date 2020/9/6
 */
public class no5509 {

    static class Node {
        int val;
        char aChar;

        Node(int val, char aChar) {
            this.aChar = aChar;
            this.val = val;
        }
    }

    public int minCost(String s, int[] cost) {
        if (s == null || cost == null) {
            return 0;
        }
        Deque<Node> queue = new LinkedList<>();
        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (queue.isEmpty()) {
                queue.addLast(new Node(cost[i], chars[i]));
                continue;
            }
            Node node = queue.peekLast();
            if (node.aChar == chars[i]) {
                if (cost[i] <= node.val) {
                    res += cost[i];
                }else {
                    res += node.val;
                    queue.pollLast();
                    queue.addLast(new Node(cost[i], chars[i]));
                }
            }
            queue.addLast(new Node(cost[i], chars[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new no5509().minCost("abaac", new int[]{1, 2, 3, 4, 5}));
    }
}

package me.sofiworker.sword.no38;

/**
 * @author sofiworker
 * @date 2020/8/4
 */
public class Solution {

    static class Node {
        char val;
        Node next;
    }

    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        Node head = null;
        Node cur = null;
        for (int i = 0; i < chars.length; i++) {
            Node node = new Node();
            node.val = chars[i];
            if (i == 0) {
                head = node;
            }else {
                cur.next = node;
            }
            node.next = head;
            cur = node;
        }
        Node temp = head;
        String[] result = new String[10000];
        while (true) {
            if (temp.next == head) {
                break;
            }

        }
        return result;
    }
}

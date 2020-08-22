package me.sofiworker.leetcode.no2;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author sofiworker
 */
public class Solution {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1, h2 = l2, head = null, tail;
        int in = 0;
        while (true) {
            if (h1 != null && h2 != null) {
                int val = h1.val + h2.val + in;
                if (val >= 10) {
                    in = 1;
                    val = val - 10;
                }
                ListNode listNode = new ListNode(val);
                if (head == null) {
                    head = listNode;
                    tail = listNode;
                }
            }
            if (h1 == null && h2 == null) {
                break;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "aaaaa");
        hashMap.get(1);
        hashMap.remove("11");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "aa");
    }
}
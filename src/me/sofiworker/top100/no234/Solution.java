package me.sofiworker.top100.no234;

import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/12/8
 */
public class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            // TODO: 2020/12/8  
            sb.append(head.val);
            head = head.next;
        }
        return new String(sb).equals(new String(sb.reverse()));
    }
}

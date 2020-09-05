package me.sofiworker.top100.no2;

/**
 * @author sofiworker
 * @date 2020/9/4
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int over = 0;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + over;
            over = temp >= 10 ? 1 : 0;
            ListNode next = new ListNode(temp >= 10 ? temp - 10 : temp);
            cur.next = next;
            cur = next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l2 != null) {
            int temp = l2.val + over;
            over = temp >= 10 ? 1 : 0;
            ListNode next = new ListNode(temp >= 10 ? temp - 10 : temp);
            cur.next = next;
            cur = next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int temp = l1.val + over;
            over = temp >= 10 ? 1 : 0;
            ListNode next = new ListNode(temp >= 10 ? temp - 10 : temp);
            cur.next = next;
            cur = next;
            l1 = l1.next;
        }
        if (over == 1) {
            cur.next = new ListNode(1);
        }
        return head.next;
    }
}

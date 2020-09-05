package me.sofiworker.top100.no21;

/**
 * @author sofiworker
 * @date 2020/9/5
 */
public class Solution {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode head = null;
        ListNode cur = null;
        while (l1 != null && l2 != null) {
            if (head == null && l1.val <= l2.val) {
                head = l1;
                cur = head;
                l1 = l1.next;
                continue;
            }else if (head == null) {
                head = l2;
                cur = head;
                l2 = l2.next;
                continue;
            }
            if (l1.val <= l2.val) {
                cur.next = l1;
                cur = l1;
                l1 = l1.next;
                continue;
            }
            cur.next = l2;
            cur = l2;
            l2 = l2.next;
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return head;
    }
}

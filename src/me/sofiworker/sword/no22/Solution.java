package me.sofiworker.sword.no22;

/**
 * @author sofiworker
 * @date 2020/8/10
 */
public class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur = head;
        ListNode pre = head;
        int count = 0;
        while (cur != null) {
            if (count >= k) {
                pre = pre.next;
            }
            cur = cur.next;
            count++;
        }
        return pre;
    }
}

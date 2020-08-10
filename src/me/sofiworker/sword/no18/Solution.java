package me.sofiworker.sword.no18;

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


    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode cur = head;
        ListNode pre = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }
}

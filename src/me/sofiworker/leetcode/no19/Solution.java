package me.sofiworker.leetcode.no19;

/**
 * @author sofiworker
 * @date 2020/8/2
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp1 = head;
        int sum = 0;
        while (true) {
            sum++;
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        int index = sum - n;
        if (index != 0) {
            for (int i = 1; i < index; i++) {
                temp1 = temp1.next;
            }
            temp1.next = temp1.next.next;
            return head;
        }else {
            return null;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

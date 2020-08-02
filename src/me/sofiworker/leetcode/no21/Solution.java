package me.sofiworker.leetcode.no21;

/**
 * @author sofiworker
 * @date 2020/8/2
 */
public class Solution {

    private ListNode list = new ListNode();

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node1 = l1;
        ListNode node2 = l2;
        while (true) {
            if (node1 == null) {
                break;
            }
            insertElement(node1);
            node1 = node1.next;
        }
        while (true) {
            if (node2 == null) {
                break;
            }
            insertElement(node2);
            node2 = node2.next;
        }
        return list;
    }

    private void insertElement(ListNode node) {
        ListNode temp = list;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.val <= node.val) {
                node.next = temp.next;
                temp.next = node;
                break;
            }
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

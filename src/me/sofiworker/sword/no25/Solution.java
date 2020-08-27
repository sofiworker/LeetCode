package me.sofiworker.sword.no25;

/**
 * @author sofiworker
 * @date 2020/8/23
 */
public class Solution {


    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode res = null;
        ListNode temp = null;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val){
                    if (res == null) {
                        res = l1;
                    }else {
                        temp.next = l1;
                    }
                    temp = l1;
                    l1 = l1.next;
                }else {
                    if (res == null) {
                        res = l2;
                    }else {
                        temp.next = l2;
                    }
                    temp = l2;
                    l2 = l2.next;
                }
                continue;
            }
            if (l1 != null) {
                if (res == null) {
                    res = l1;
                }else {
                    temp.next = l1;
                }
                temp = l1;
                l1 = l1.next;
            }
            if (l2 != null) {
                if (res == null) {
                    res = l2;
                }else {
                    temp.next = l2;
                }
                temp = l2;
                l2 = l2.next;
            }
        }
        return res;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }
}

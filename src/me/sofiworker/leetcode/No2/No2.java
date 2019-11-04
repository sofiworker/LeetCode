package me.sofiworker.leetcode.No2;

public class No2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        new No2().addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //进位数
        int carry = 0;
        ListNode tempRes = new ListNode(0);
        ListNode res = tempRes;
        while (l1 != null || l2 != null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            tempRes.val = x + y + carry;
            if (tempRes.val >= 10){
                carry = 1;
                res.val = res.val - 10;
            }
            l1 = l1.next;
            l2 = l2.next;
            tempRes.next = new ListNode(0);
        }
        if (carry == 1){
            tempRes.next = new ListNode(1);
        }
        return res;
    }
}

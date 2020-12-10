package me.sofiworker.sword.no6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sofiworker
 * @date 2020/8/3
 */
public class Solution {

    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        List<Integer> record = new ArrayList<>();
        while (head != null) {
            record.add(head.val);
            head = head.next;
        }
        int[] result = new int[record.size()];
        int j = 0;
        for (int i = record.size() - 1; i >= 0; i--) {
            result[j++] = record.get(i);
        }
        return result;
    }

    public int[] reversePrint2(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        int[] temp = new int[10000];
        int index = 9999;
        while (head != null) {
            temp[index--] = head.val;
            head = head.next;
        }
        int[] result = new int[9999 - index];
        System.arraycopy(temp, index + 1, result, 0, result.length);
        return result;
    }
}

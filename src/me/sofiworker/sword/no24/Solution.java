package me.sofiworker.sword.no24;

import java.util.*;

/**
 * @author sofiworker
 * @date 2020/8/22
 */
public class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while (true) {
            stack.push(head);
            if (head.next == null) {
                break;
            }
            ListNode next = head.next;
            head.next = null;
            head = next;
        }
        ListNode res = null;
        ListNode temp = null;
        while (!stack.isEmpty()) {
            if (res == null) {
                res = stack.pop();
                temp = res;
                continue;
            }
            ListNode pop = stack.pop();
            temp.next = pop;
            temp = pop;
        }
        return res;
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = null;
        while (head != null) {
            //先保存访问的节点的下一个节点，保存起来
            //留着下一步访问的
            ListNode temp = head.next;
            //每次访问的原链表节点都会成为新链表的头结点，
            //其实就是把新链表挂到访问的原链表节点的
            //后面就行了
            head.next = newHead;
            //更新新链表
            newHead = head;
            //重新赋值，继续访问
            head = temp;
        }
        //返回新链表
        return newHead;
    }

    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("1", "a");
        hashtable.put("2", "b");
        hashtable.put("3", "c");
        System.out.println(hashtable.get("1"));
//        TreeSet<String> treeSet = new TreeSet<>();
//        treeSet.add("a");
//        treeSet.add("b");
//        treeSet.add("c");
//        System.out.println(treeSet);
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("1", "a");
        hashMap.put("2", "b");
        System.out.println(hashMap);
    }
}

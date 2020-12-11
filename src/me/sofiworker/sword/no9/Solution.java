package me.sofiworker.sword.no9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/8/3
 *
 * 一个栈只负责维护进栈的元素，
 * 删除时，判断另外一个如果为空，将第一个栈的元素全部放到空栈，然后返回，否则直接返回
 */
public class Solution {

    class CQueue {

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                return -1;
            }else if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }else {
                return stack2.pop();
            }
        }
    }

    class CQueue1 {
        Deque<Integer> stack1;
        Deque<Integer> stack2;

        public CQueue1() {
            stack1 = new LinkedList<Integer>();
            stack2 = new LinkedList<Integer>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            // 如果第二个栈为空
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (stack2.isEmpty()) {
                return -1;
            } else {
                int deleteItem = stack2.pop();
                return deleteItem;
            }
        }
    }
}

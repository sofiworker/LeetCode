package me.sofiworker.sword.no30;

import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/8/14
 */
public class Solution {

    static class MinStack {

        private Stack<Integer> dataStack;
        // helpStack 保存当前栈的最小值
        private Stack<Integer> helpStack;

        /** initialize your data structure here. */
        public MinStack() {
            dataStack = new Stack<>();
            helpStack = new Stack<>();
        }

        public void push(int x) {
            dataStack.push(x);
            if (helpStack.isEmpty() || helpStack.peek() >= x) {
                helpStack.push(x);
            }
        }

        public void pop() {
            Integer pop = dataStack.pop();
            if (!helpStack.isEmpty() && pop.equals(helpStack.peek())) {
                helpStack.pop();
            }
        }

        public int top() {
            return dataStack.peek();
        }

        public int min() {
            if (!helpStack.isEmpty()) {
                return helpStack.peek();
            }
            return -1;
        }
    }
}

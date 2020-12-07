package me.sofiworker.top100.no155;

import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/12/7
 */
public class Solution {

    static class MinStack {

        private Stack<Integer> minStack;
        private Stack<Integer> dataStack;
        /** initialize your data structure here. */
        public MinStack() {
            minStack = new Stack<>();
            dataStack = new Stack<>();
        }

        public void push(int x) {
            dataStack.push(x);
            if (!minStack.isEmpty() && minStack.peek() >= x) {
                minStack.push(x);
            }else if (minStack.isEmpty()) {
                minStack.push(x);
            }
        }

        public void pop() {
            Integer pop = dataStack.pop();
            if (pop.equals(minStack.peek())) {
                minStack.pop();
            }
        }

        public int top() {
            return dataStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}

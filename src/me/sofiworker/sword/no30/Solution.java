package me.sofiworker.sword.no30;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sofiworker
 * @date 2020/8/14
 */
public class Solution {

    static class MinStack {

        private List<Integer> dataList;

        public MinStack() {
            dataList = new ArrayList<>();
        }

        public void push(int x) {
            dataList.add(x);
        }

        public void pop() {
            dataList.remove(dataList.size() - 1);
        }

        public int top() {
            return dataList.get(dataList.size() - 1);
        }

        public int min() {
            if (dataList.size() >= 1) {
                int min = dataList.get(0);
                for (Integer integer : dataList) {
                    if (min >= integer) {
                        min = integer;
                    }
                }
                return min;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.min();
        minStack.pop();
        minStack.top();
        minStack.min();
    }
}

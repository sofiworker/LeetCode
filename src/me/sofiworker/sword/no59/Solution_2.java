package me.sofiworker.sword.no59;

import java.util.*;

/**
 * @author sofiworker
 * @date 2020/8/16
 */
public class Solution_2 {

    static class MaxQueue {

        private final Queue<Integer> queue;
        private final List<Integer> list;

        public MaxQueue() {
            queue = new LinkedList<>();
            list = new LinkedList<>();
        }

        public int max_value() {
            if (list.isEmpty()) {
                return -1;
            }
            Collections.sort(list);
            return list.get(list.size() - 1);
        }

        public void push_back(int value) {
            queue.add(value);
            list.add(value);
        }

        public int pop_front() {
            if (queue.isEmpty()) {
                return -1;
            }
            Integer poll = queue.poll();
            list.remove(poll);
            return poll;
        }
    }

    static class MaxQueue1 {

        private final Queue<Integer> queue;
        private final Deque<Integer> list;

        public MaxQueue1() {
            queue = new LinkedList<>();
            list = new LinkedList<>();
        }

        public int max_value() {
            if (list.isEmpty()) {
                return -1;
            }
            return list.peek();
        }

        public void push_back(int value) {
            queue.add(value);
            while (!list.isEmpty() && list.peekLast() < value) {
                list.pollLast();
            }
            list.addLast(value);
        }

        public int pop_front() {
            if (queue.isEmpty()) {
                return -1;
            }
            Integer poll = queue.poll();
            list.remove(poll);
            return poll;
        }
    }
}

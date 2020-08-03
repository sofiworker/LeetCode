package me.sofiworker.sword.no9;

import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author sofiworker
 * @date 2020/8/3
 */
public class CQueue {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
        stack2.clear();
        Object[] array = stack1.toArray();
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        for (Object o : array) {
            stack1.push((int)o);
        }
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            return -1;
        }
        return stack2.pop();
    }
}

package me.sofiworker.sword.no9;

import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/8/3
 *
 * 一个栈只负责维护进栈的元素，
 * 删除时，判断另外一个如果为空，将第一个栈的元素全部放到空栈，然后返回，否则直接返回
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
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        cQueue.appendTail(3);
    }
}

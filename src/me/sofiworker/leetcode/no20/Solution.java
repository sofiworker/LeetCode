package me.sofiworker.leetcode.no20;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/8/5
 */
public class Solution {

    public boolean isValid(String s) {
        if ("".equals(s)) {
            return true;
        }
        if (s.length() >= 2 && s.length() % 2 == 0) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            boolean isMatch = false;
            for (char aChar : chars) {
                if (aChar != '(' && aChar != ')' && aChar != '[' && aChar != ']' && aChar != '{' && aChar != '}') {
                    return false;
                }
                if (stack.isEmpty()) {
                    stack.push(aChar);
                    continue;
                }
                switch (aChar) {
                    case ')':
                        if (stack.peek().compareTo('(') != 0) {
                            return false;
                        }else {
                            isMatch = true;
                        }
                        break;
                    case ']':
                        if (stack.peek().compareTo('[') != 0) {
                            return false;
                        }else {
                            isMatch = true;
                        }
                        break;
                    case '}':
                        if (stack.peek().compareTo('{') != 0) {
                            return false;
                        }else {
                            isMatch = true;
                        }
                        break;
                }
                if (!isMatch) {
                    stack.push(aChar);
                }else {
                    stack.pop();
                    isMatch = false;
                }
            }
            return stack.isEmpty();
        }else {
            return false;
        }
    }

    public boolean isValid1(String s) {
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

    public boolean isValid3(String s) {
        Stack<Character>stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(') {
                stack.push(')');
            } else if(c=='[') {
                stack.push(']');
            } else if(c=='{') {
                stack.push('}');
            } else if(stack.isEmpty()||c!=stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid3("()"));
    }
}

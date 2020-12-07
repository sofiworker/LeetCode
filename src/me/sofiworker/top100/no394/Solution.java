package me.sofiworker.top100.no394;

import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/12/7
 */
public class Solution {

    public String decodeString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                sb.append(chars[i]);
            }
            if (chars[i] >= '0' && chars[i] <= '9') {
                stack.push(chars[i]);
            }
            if (!stack.isEmpty() && stack.peek() == '[') {
                // TODO: 2020/12/7  
            }
        }
        return new String(sb);
    }
}

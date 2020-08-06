package me.sofiworker.leetcode.no66;

import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/8/5
 */
public class Solution {

    public int[] plusOne(int[] digits) {
//        Stack<Integer> stack = new Stack<>();
//        int j = -1;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (stack.isEmpty()) {
//                int record = digits[i] + 1;
//                if (record >= 10) {
//                    stack.push(record - 10);
//                    j = 1;
//                }else {
//                    stack.push(record);
//                }
//            }else {
//                if (j == 1) {
//                    int record = digits[i] + 1;
//                    if (record >= 10) {
//                        stack.push(record - 10);
//                        j = 1;
//                    }else {
//                        stack.push(record);
//                        j = -1;
//                    }
//                }else {
//                    stack.push(digits[i]);
//                }
//            }
//        }
//        if (j != -1) {
//            stack.push(j);
//        }
//        int[] res = new int[stack.size()];
//        int i = 0;
//        while (!stack.isEmpty()) {
//            res[i++] = stack.pop();
//        }
//        return res;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

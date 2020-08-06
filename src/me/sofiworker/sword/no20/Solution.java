package me.sofiworker.sword.no20;

import java.util.Stack;

/**
 * @author sofiworker
 * @date 2020/8/4
 */
public class Solution {

    public boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
//        char[] chars = s.toCharArray();
//        if (chars.length >= 2) {
//            if ((chars[0] < '0' && chars[0] != '+' && chars[0] != '-') || chars[0] > '9') {
//                return false;
//            }
//            for (int i = 0; i < chars.length; i++) {
//                if ((chars[0] == '+' || chars[0] == '-') && (chars[1] < '0' && chars[1] > '9')) {
//                    return false;
//                }else if (chars[i] == 'e' && (chars[i+1] >= '0' && chars[i+1] <= '9')) {
//                    return false;
//                }
//            }
//        }else {
//            return chars[0] >= '0' && chars[0] <= '9';
//        }
//        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isNumber("-11e1"));
    }
}

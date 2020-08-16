package me.sofiworker.leetcode.no43;

/**
 * @author sofiworker
 * @date 2020/8/13
 */
public class Solution {

    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new Solution().multiply("85", "34"));
    }
}

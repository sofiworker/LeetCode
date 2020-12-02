package me.sofiworker.leetcode.no50;

/**
 * @author sofiworker
 * @date 2020/9/14
 */
public class Solution {

    public double myPow(double x, int n) {
        if (x == 0 && n == 0) {
            return 0;
        }else if (n == 0) {
            return 1;
        }
        int abs = Math.abs(n);
        for (int i = 0; i < abs - 1; i++) {
            x *= x;
        }
        if (n < 0) {
            return 1 / x;
        }else {
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2, 10));
    }
}

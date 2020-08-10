package me.sofiworker.sword.no15;

/**
 * @author sofiworker
 * @date 2020/8/10
 */
public class Solution {

    public int hammingWeight(int n) {
        int result = 0;
        do {
            int i = n % 2;
            if (i == 1) {
                result++;
            }
            n = n / 2;
        } while (n != 0);
        return result;
    }
}

package me.sofiworker.weekly.no5625;

/**
 * @author sofiworker
 * @date 2020/12/13
 */
public class Solution {

    public int numberOfMatches(int n) {
        count(n);
        return result;
    }

    private int result = 0;

    public void count(int n) {
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            result += n / 2;
            count(n / 2);
        }else {
            result += (n - 1) / 2;
            count((n - 1) / 2 + 1);
        }
    }
}

package me.sofiworker.sword.no64;

/**
 * @author sofiworker
 * @date 2020/8/13
 */
public class Solution {

    public int sumNums(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

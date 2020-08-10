package me.sofiworker.sword.no17;

/**
 * @author sofiworker
 * @date 2020/8/10
 */
public class Solution {

    public int[] printNumbers(int n) {
        int[] result = new int[(int) Math.pow(10, n) - 1];
        for (int i = 1; i < (int) Math.pow(10, n); i++) {
            result[i-1] = i;
        }
        return result;
    }
}

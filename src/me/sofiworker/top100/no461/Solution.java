package me.sofiworker.top100.no461;

/**
 * @author sofiworker
 * @date 2020/12/7
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        int result = 0;
        int z = x ^ y;
        for (char c : Integer.toBinaryString(z).toCharArray()) {
            if (c == '1') {
                result++;
            }
        }
        return result;
    }
}

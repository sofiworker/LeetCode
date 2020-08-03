package me.sofiworker.sword.no4;

/**
 * @author sofiworker
 * @date 2020/8/3
 */
public class Solution {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (target == anInt) {
                    return true;
                }
            }
        }
        return false;
    }
}

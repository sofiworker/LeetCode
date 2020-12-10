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

    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        // TODO: 2020/12/10
        for (int i = 0; i <matrix.length;) {
            for (int j = 0; j < matrix[i].length;) {
                if (i + 1 < matrix.length && matrix[i+1][j] < target) {
                    i++;
                    break;
                }else if (j + 1 < matrix[i].length && matrix[i][j+1] < target) {
                    j++;
                }else if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

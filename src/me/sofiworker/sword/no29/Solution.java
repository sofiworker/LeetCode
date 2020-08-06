package me.sofiworker.sword.no29;

/**
 * @author sofiworker
 * @date 2020/8/4
 */
public class Solution {

    public int[] spiralOrder(int[][] matrix) {
        int[] result = new int[matrix.length*matrix[0].length];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            int j;
            for (j = 0; j < matrix[i].length; j++) {
                result[k++] =  matrix[i][j];
            }
            for (int l = i; l < matrix.length; l++) {
                result[k++] = matrix[l][j];
            }
        }
        return result;
    }
}

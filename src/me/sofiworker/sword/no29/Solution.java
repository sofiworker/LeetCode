package me.sofiworker.sword.no29;

/**
 * @author sofiworker
 * @date 2020/8/4
 */
public class Solution {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return new int[0];
        }
        int[] result = new int[matrix.length * matrix[0].length];
        int row = matrix.length;
        int col = matrix[0].length;
        int index = 0;
        while (true) {
            // 从左到右
            for (int i = 0; i < col; i++) {
                result[index++] = matrix[row][i];
            }
            // 从上到下
            for (int j = 0; j < row; j++) {
                result[index++] = matrix[j][col];
            }
            // 从右到左
            for (int k = col; k >= 0; k--) {
                result[index++] = matrix[row][col];
            }
            // 从下到上
//            for (int l = ; ;) {
//                result[index++] = matrix[row][col];
//            }
            break;
        }
        return result;
    }
}

package me.sofiworker.sword.no29;

/**
 * @author sofiworker
 * @date 2020/8/4
 */
public class Solution {

    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) {
            return new int[0];
        }
        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;
        int index = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while(true) {
            // 左到右
            for(int i = l; i <= r; i++) {
                res[index++] = matrix[t][i];
            }
            if(++t > b) {
                break;
            }
            // 上到下
            for(int i = t; i <= b; i++) {
                res[index++] = matrix[i][r];
            }
            if(l > --r) {
                break;
            }
            // 右到左
            for(int i = r; i >= l; i--) {
                res[index++] = matrix[b][i];
            }
            if(t > --b) {
                break;
            }
            // 上到下
            for(int i = b; i >= t; i--) {
                res[index++] = matrix[i][l];
            }
            if(++l > r) {
                break;
            }
        }
        return res;
    }
}

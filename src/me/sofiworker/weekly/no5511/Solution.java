package me.sofiworker.weekly.no5511;

/**
 * @author sofiworker
 * @date 2020/9/13
 */
public class Solution {

    public int numSpecial(int[][] mat) {
        if (mat == null) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    if (isRowZero(mat[i], j) && isColZero(mat, i, j)) {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    private boolean isRowZero(int[] temp, int index) {
        for (int i = 0; i < temp.length; i++) {
            if (index == i) {
                continue;
            }
            if (temp[i] == 1) {
                return false;
            }
        }
        return true;
    }

    private boolean isColZero(int[][] temp, int i, int j) {
        for (int i1 = 0; i1 < temp.length; i1++) {
            if (i1 == i) {
                continue;
            }
            if (temp[i1][j] == 1) {
                return false;
            }
        }
        return true;
    }
}

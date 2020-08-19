package me.sofiworker.sword.no47;

/**
 * @author sofiworker
 * @date 2020/8/17
 */
public class Solution {

    public int maxValue(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int sum = grid[0][0];
        int i = 0, j = 0;
        if (row == 1 && column == 1){
            return sum;
        }
        if (row == 1) {
            sum = 0;
            for (int i1 : grid[0]) {
                sum += i1;
            }
            return sum;
        }else {
            while (i < row && j < column && i != row - 1 && j != column - 1) {
                int rightVal = grid[i][j + 1];
                int nextVal = grid[i + 1][j];
                if (rightVal > nextVal) {
                    sum += rightVal;
                    j++;
                }else {
                    sum += nextVal;
                    i++;
                }
            }
            return sum + grid[row - 1][column - 1];
        }
    }

    public int maxValue1(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) continue;
                if(i == 0) grid[i][j] += grid[i][j - 1] ;
                else if(j == 0) grid[i][j] += grid[i - 1][j];
                else grid[i][j] += Math.max(grid[i][j - 1], grid[i - 1][j]);
            }
        }
        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] g = {{1,2, 5}, {3, 2, 1}};
    }
}

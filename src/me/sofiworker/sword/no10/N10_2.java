package me.sofiworker.sword.no10;

/**
 * @author sofiworker
 * @date 2020/8/4
 */
public class N10_2 {

    public int numWays(int n) {
        int[] result = new int[101];
        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        result[3] = 3;
        for (int i = 4; i < result.length; i++) {
            result[i] = result[i-2] + result[i-1];
            if (result[i] > 1000000007) {
                result[i] = result[i] % 1000000007;
            }
        }
        return result[n];
    }
}

package me.sofiworker.sword.no10;

/**
 * @author sofiworker
 * @date 2020/8/3
 */
public class N10_1 {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] result = new int[101];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < result.length; i++) {
            result[i] = result[i-1] + result[i-2];
            if (result[i] > 1000000007) {
                result[i] = result[i] % 1000000007;
            }
        }
        return result[n-1];
    }

    public int fib2(int n) {
        if (n < 2) {
            return n;
        }
        int x = 0;
        int y = 1;
        int z = 0;
        for (int i = 1; i < n; i++) {
            z = (x + y) % 1000000007;
            x = y;
            y = z;
        }
        return z;
    }
}

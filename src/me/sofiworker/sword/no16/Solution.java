package me.sofiworker.sword.no16;

/**
 * @author sofiworker
 * @date 2020/8/20
 */
public class Solution {

    public double myPow(double x, int n) {
        if(x == 0) {
            return 0;
        }
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public double myPow1(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int abs = Math.abs(n);
        int temp = abs;
        if (abs % 2 != 0) {
            abs = abs - 1;
        }
        double res = 1;
        while (abs != 0) {
            res *= x;
            abs = abs >> 1;
        }
        if (temp % 2 != 0) {
            res *= x;
        }
        if (n < 0) {
            return 1 / res;
        }
        return res;
    }
}

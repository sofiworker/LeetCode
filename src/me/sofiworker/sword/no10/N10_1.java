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
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(1000));
    }
}

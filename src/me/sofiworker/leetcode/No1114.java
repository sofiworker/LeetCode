package me.sofiworker.leetcode;

/**
 * @author sofiworker
 * @version 1.0.0
 * @date 2020/4/6 19:58
 */
public class No1114 {

    static class Foo {

        volatile int flag = 1;

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            flag = 2;
        }

        public void second(Runnable printSecond) throws InterruptedException {

            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
        }

        public void third(Runnable printThird) throws InterruptedException {

            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}

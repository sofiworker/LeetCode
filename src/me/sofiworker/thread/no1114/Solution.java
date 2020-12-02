package me.sofiworker.thread.no1114;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * @author sofiworker
 * @date 2020/11/29
 */
public class Solution {

    class Foo {

        public Foo() {

        }

        private Semaphore semaphore = new Semaphore(2);
        private CountDownLatch latch = new CountDownLatch(3);

        public void first(Runnable printFirst) throws InterruptedException {
            latch.countDown();
            semaphore.acquire(1);
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            latch.countDown();
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
        }

        public void third(Runnable printThird) throws InterruptedException {
            latch.countDown();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}

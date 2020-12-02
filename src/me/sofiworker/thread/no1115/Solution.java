package me.sofiworker.thread.no1115;

/**
 * @author sofiworker
 * @date 2020/11/29
 */
public class Solution {

    class FooBar {
        private int n;
        private volatile boolean finish = false;
        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {

                // printFoo.run() outputs "foo". Do not change or remove this line.
                while(finish){
                    Thread.yield();
                }
                printFoo.run();
                finish=true;
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {

                // printBar.run() outputs "bar". Do not change or remove this line.
                while (!finish){
                    Thread.yield();
                }
                printBar.run();
                finish=false;
            }
        }
    }
}

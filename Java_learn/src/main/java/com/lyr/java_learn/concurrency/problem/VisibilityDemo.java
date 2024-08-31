package com.lyr.java_learn.concurrency.problem;

/**
 * 内存可见性示例
 */
public class VisibilityDemo {
    private static boolean shutdown = false;
    static class HelloThread extends Thread {
        public void run() {
            while (!shutdown) {
                // do something
            }
            System.out.println("exit hello");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        new HelloThread().start();
        Thread.sleep(1000);
        shutdown = true;
        System.out.println("main exit");
    }
}

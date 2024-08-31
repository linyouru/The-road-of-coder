package com.lyr.java_learn.concurrency.problem;

/**
 * 竞态条件,当多个线程访问和操作同一个对象时，最终执行结果与执行时许有关，可能正确也可能不正确。
 */
public class CounterThread extends Thread{
    private static int counter = 0;
    public void run() {
        for (int i = 0; i < 1000; i++) {
            // counter++不是原子性的
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread();
            threads[i].start();
        }
        for (int i = 0; i < num; i++) {
            threads[i].join();
        }
        //
        System.out.println(counter);
    }
}

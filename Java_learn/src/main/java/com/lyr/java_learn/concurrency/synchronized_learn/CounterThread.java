package com.lyr.java_learn.concurrency.synchronized_learn;

/**
 * 使用synchronized解决竞争条件问题
 */
public class CounterThread extends Thread{
    Counter counter;
    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incr();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Counter counter = new Counter();
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++){
            threads[i] = new CounterThread(counter);
            threads[i].start();
        }
        for (int i = 0; i < num; i++){
                threads[i].join();
        }
        System.out.println(counter.getCount());
    }
}

package com.lyr.java_learn.concurrency.synchronized_learn;

public class Counter {
    private int count;

    // synchronized 确保了count++执行是原子性的
    public synchronized void incr() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

package com.lyr.java_learn.concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 * 共享内存示例
 */
public class ShareMemoryDemo {
    private static int shared = 0;

    private static void incrShared() {
        shared++;
    }

    static class ChildThread extends Thread {
        List<String> list;

        public ChildThread(List<String> list) {
            this.list = list;
        }

        @Override
        public void run() {
            incrShared();
            list.add(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        ChildThread childThread1 = new ChildThread(list);
        ChildThread childThread2 = new ChildThread(list);
        childThread1.start();
        childThread2.start();
        childThread1.join();
        childThread2.join();
        System.out.println(shared);
        System.out.println(list);
    }

}

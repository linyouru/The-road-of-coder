package com.lyr.java_learn.concurrency;

/**
 * 创建线程的方法其二，实现Runnable
 */
public class MyRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println("Thread name = "+ Thread.currentThread().getName());
        System.out.println("MyRunnable");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread name = "+ Thread.currentThread().getName());
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("main is end");

    }
}

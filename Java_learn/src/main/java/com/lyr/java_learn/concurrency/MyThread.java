package com.lyr.java_learn.concurrency;

/**
 * 15.1
 * 创建线程的方法其一，继承Thread
 */
public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Thread name = "+ Thread.currentThread().getName());
        System.out.println("MyThread");
    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("MyThread");
        // 启动线程
        myThread.start();
    }

}

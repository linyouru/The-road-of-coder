package com.lyr.java_learn.combination;

public interface IAdd {
    void add(int number);
    void addAll(int[] numbers);

    static void test(){
        System.out.println("java8支持接口创建静态方法");
    }

    default void test2(){
        System.out.println("java8支持接口创建默认方法");
    }
}

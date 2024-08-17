package com.lyr.java_learn.combination;

public class Base implements IAdd{
    private static final int MAX_NUM = 100;
    private int[] arr = new int[MAX_NUM];
    private int count = 0;
    @Override
    public void add(int number) {
        if(count<MAX_NUM){
            arr[count++] = number;
        }
    }

    @Override
    public void addAll(int[] numbers) {
        for (int number : numbers) {
            add(number);
        }
    }
}

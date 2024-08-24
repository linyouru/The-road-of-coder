package com.lyr.java_learn.genericity;

// 上界为某个具体的类
public class NumberPair<U extends Number, V extends Number> extends Pair<U, V> {

    public NumberPair(U first, V second) {
        super(first, second);
    }

    public double sum() {
        return getFirst().doubleValue() + getSecond().doubleValue();
    }

    public static void main(String[] args) {
        NumberPair<Integer, Double> pair = new NumberPair<>(1, 2.23);
        pair.sum();
    }

    //上界为某个接口
    public static <T extends Comparable<T>> T max(T[] arr) {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}

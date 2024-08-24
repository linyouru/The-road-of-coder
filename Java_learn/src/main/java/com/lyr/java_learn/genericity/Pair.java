package com.lyr.java_learn.genericity;

/**
 * 简单的泛型类
 * @param <U>
 * @param <V>
 */
public class Pair<U,V> {
    U first;
    V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String,Integer> minmax = new Pair<>("lin", 100);
        String min = minmax.getFirst();
        Integer max = minmax.getSecond();
        System.out.println("min = " + min + ", max = " + max);
    }


}

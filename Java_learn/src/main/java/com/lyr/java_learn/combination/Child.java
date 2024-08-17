package com.lyr.java_learn.combination;

public class Child implements IAdd{
    private Base base;
    private long sum;

    public Child(Base base) {
        this.base = base;
    }

    @Override
    public void add(int number) {
        base.add(number);
        sum += number;
    }

    @Override
    public void addAll(int[] numbers) {
        base.addAll(numbers);
        for (int number : numbers) {
            sum += number;
        }
    }

    public long getSum() {
        return sum;
    }
}

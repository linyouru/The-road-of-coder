package com.lyr.java_learn.genericity;

import java.util.Arrays;

public class DynamicArray<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elementData;

    public DynamicArray() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity >= minCapacity) {
            return;
        }
        int newCapacity = oldCapacity * 2;
        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    public void add(E e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
    }

    public E get(int index) {
        return (E) elementData[index];
    }

    public int size() {
        return size;
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    //泛型方法
    public static <T> int indexOf(T[] arr, T elm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(elm)) {
                return i;
            }
        }
        return -1;
    }

    //上界为其他类型参数
    public <T extends E> void addAll(DynamicArray<T> c) {
        for (int i = 0; i < c.size; i++) {
            add(c.get(i));
        }
    }

    //等价于addAll,有限定通配符
    public void addAll2(DynamicArray<? extends E> c) {

    }

    //等价于indexOf3,无限定通配符
    public static  int indexOf2(DynamicArray<?> arr, Object elm) {
        for (int i = 0; i < arr.size; i++) {
            if (arr.get(i).equals(elm)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int indexOf3(DynamicArray<T> arr, Object elm) {
        for (int i = 0; i < arr.size; i++) {
            if (arr.get(i).equals(elm)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        DynamicArray<Double> dynamicArray = new DynamicArray<>();
        DynamicArray<Pair<Integer, String>> arr = new DynamicArray<>();

        indexOf(new Integer[]{1, 3, 5}, 10);
        indexOf(new String[]{"a", "b", "c"}, "a");

        DynamicArray<Number> numbers = new DynamicArray<>();
        DynamicArray<Integer> ints = new DynamicArray<>();
        ints.add(100);
        ints.add(34);
        numbers.addAll(ints);
    }
}

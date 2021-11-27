package com.pb.andreiev.hw10;

import java.util.*;
public class NumBox<T extends Number> {
    private final List<T> arr;
    private final int size;
    public NumBox(int size) {
        this.size = size;
        arr = new ArrayList<>(size);
    }
    public void add(T num) {
        if (arr.size() <= size-1)
            arr.add(num);
        else throw new ArrayIndexOutOfBoundsException();
    }
    public int length() {
        return arr.toArray().length;
    }

    public double average() {
        double sum = 0;
        for (T n : arr)  {
            sum += n.doubleValue();
        }
        return sum / arr.size();
    }
    public double sum() {
        double sum = 0;
        for (T n : arr)  {
            sum += n.doubleValue();
        }
        return sum;
    }
    public T max() {
        T maxValue = arr.get(0);
        for (T t : arr) {
            if (t.doubleValue() > maxValue.doubleValue())
                maxValue = t;
        }
        return maxValue;
    }
}
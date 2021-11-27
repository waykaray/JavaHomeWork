package com.pb.andreiev.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> numBoxInteger = new NumBox<>(3);
        try {
            numBoxInteger.add(1);
            numBoxInteger.add(2);
            numBoxInteger.add(3);
            numBoxInteger.add(4);
        } catch (Exception e) {
            System.err.println("Массив numBoxInteger переполнен");
        }
        System.out.println("Размер массива: " + numBoxInteger.length());
        System.out.println("Cреднее арифметическое: " + numBoxInteger.average());
        System.out.println("Сумма массива: " + numBoxInteger.sum());
        System.out.println("Максимальный элемент массива: " + numBoxInteger.max());
        NumBox<Float> numBoxFloat = new NumBox<>(3);
        try {
            numBoxFloat.add(1.1F);
            numBoxFloat.add(2.2F);
            numBoxFloat.add(3.3F);
            numBoxFloat.add(4.4F);
        } catch (Exception e) {
            System.err.println("Массив numBoxFloat переполнен!");
        }
        System.out.println("Размер массива: " + numBoxFloat.length());
        System.out.println("Cреднее арифметическое: : " + numBoxFloat.average());
        System.out.println("Сумма массива: " + numBoxFloat.sum());
        System.out.println("Максимальный элемент массива: " + numBoxFloat.max());
    }
}
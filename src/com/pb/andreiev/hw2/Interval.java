package com.pb.andreiev.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введіть число");
        number = scanner.nextInt();
        if (number >= 0 && number <= 14) {
            System.out.println("Інтервал  [0 -14]");
        } else if (number >= 15 && number <= 35) {
            System.out.println("Інтервал  [15 - 35]");
        } else if (number >= 36 && number <= 50) {
            System.out.println("Інтервал  [36 - 50]");
        } else if (number >= 51 && number <= 100) {
            System.out.println("Інтервал  [51 - 100]");
        } else
            System.out.println("Інший інтервал");
    }
}
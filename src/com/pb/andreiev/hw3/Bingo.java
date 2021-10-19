package com.pb.andreiev.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int random_number = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вітаю Вас у грі Вгадай число");
        System.out.println("Спробуйте вгадати число від 0 до 100:");
        System.out.println("Якщо вам набридло грати, введіть 404");
        int entered_number, countTry = 0;
        do {
            countTry++;
            entered_number = scanner.nextInt();
            if (entered_number == 404) break;
            if (entered_number > random_number) {
                System.out.println("Загадене число є меншим");
            } else if (entered_number < random_number) {
                System.out.println("Загадене число є більшим");
            } else System.out.println("Бінго, Ви вгадали");
        }
        while (entered_number != random_number);
        if (entered_number != 404) {
            System.out.println("Вам знадобилось " + countTry + " спроб для цього");
        }
        else System.out.println("Ви завершили гру достроково");
    }
}

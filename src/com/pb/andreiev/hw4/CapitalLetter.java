package com.pb.andreiev.hw4;

import java.util.Scanner;

public class CapitalLetter {
    //  Метод считывает текст введеный пользователем
    static String enterText() {
        System.out.println("Введите ваш текст");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    // Метод разделяет текст на отдельные слова
    static String[] splitText(String enteredText) {
        return enteredText.split(" ");
    }
    // Метод меняет 1 букву на заглавную в словах
    static String[] upperText (String[] splittedText) {
        for (int i = 0; i < splittedText.length; i++) {
            splittedText [i] = splittedText[i].substring(0, 1).toUpperCase() + splittedText[i].substring(1);
        }
        return splittedText;
    }
    // Метод объединяет массив в 1 строку
    static String result (String[] uppedText) {
        String delimiter = " ";
        return String.join(delimiter, uppedText);
    }
    //Метод вывод на экран итоговый текст
    static void print(String result) {
        System.out.println(result);
    }
    public static void main (String[] args) {
        String enteredText = enterText();
        if (enteredText.isEmpty()) {
            System.out.println("Не введено тексту");
        } else {
            String sameText = enteredText.toLowerCase();
            String[] splittedText = splitText(sameText);
            String[] uppedText = upperText(splittedText);
            String result = result(uppedText);
            print(result);
        }
    }
}
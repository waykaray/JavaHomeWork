package com.pb.andreiev.hw4;

import java.util.Scanner;

public class CapitalLetter {
    static String enterText() {
        System.out.println("Введите ваш текст");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static String[] splitText(String enteredText) {
        return enteredText.split(" ");
    }

    static String[] upperText(String[] splittedText) {
        for (int i = 0; i < splittedText.length; i++) {
            splittedText[i] = splittedText[i].substring(0, 1).toUpperCase() + splittedText[i].substring(1);
        }
        return splittedText;
    }

    static String result(String[] uppedText) {
        String delimiter = " ";
        return String.join(delimiter, uppedText);
    }

    static void print(String result) {
        System.out.println(result);
    }

    public static void main(String[] args) {
        String enteredText = enterText();
        String sameText = enteredText.toLowerCase();
        String[] splittedText = splitText(sameText);
        String[] uppedText = upperText(splittedText);
        String result = result(uppedText);
        print(result);
    }
}
package com.pb.andreiev.hw4;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
      static String enterText() {
        System.out.println("Введите ваш текст");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    static String sort (String enteredText) {
          char[] sortedText = enteredText.toCharArray();
          Arrays.sort(sortedText);
          return new String(sortedText);
    }
    static void isAnagram (String enteredText1, String enteredText2) {
        System.out.println(sort(enteredText1).equals(sort(enteredText2)) ? "Строки являются анаграмами" : "Строки не являются анаграмами");
    }
    public static void main(String[] args) {
          String enteredText1 = enterText().replaceAll("[\\p{P}|\\s]","").toLowerCase();
          String enteredText2 = enterText().replaceAll("[\\p{P}|\\s]","").toLowerCase();
          if (enteredText1.isEmpty() && enteredText2.isEmpty()) System.out.println("Не введен текст");
          else isAnagram(enteredText1, enteredText2);
      }
}
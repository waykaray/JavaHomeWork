package com.pb.andreiev.hw9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    public static void createNumbersFile() throws Exception {
        Path path = Files.createFile(Paths.get("C:\\Users\\HP\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\andreiev\\hw9\\numbers.txt"));
        Random r = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i] = r.nextInt(100);
        try (BufferedWriter w = Files.newBufferedWriter(path)) {
            for (int i = 0; i <= arr.length - 1; i++) {
                if (i % 10 == 0)
                    w.write("\n" + arr[i] + " ");
                else
                    w.write(arr[i] + " ");
            }
        }
    }
    public static void createOddNumbersFile() {
        Path path = Paths.get("C:\\Users\\HP\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\andreiev\\hw9\\numbers.txt");
        try {
            Scanner s = new Scanner(path);
            int i = 0;
            while (s.hasNextInt()) {
                i++;
                s.nextInt();
            }
            int[] array = new int[i];
            Scanner s1 = new Scanner(path);
            for (int n = 0; n < array.length; n++) {
                array[n] = s1.nextInt();
            }
            for (int n = 1; n < array.length; n++) {
                if (array[n] % 2 == 0)
                    array[n] = 0;
            }
            Path anotherPath = Files.createFile(Paths.get("C:\\Users\\HP\\IdeaProjects\\JavaHomeWork\\src\\com\\pb\\andreiev" +
                    "\\hw9\\odd-numbers.txt"));
            try (BufferedWriter w = Files.newBufferedWriter(anotherPath)) {
                for (int n = 0; n <= array.length - 1; n++) {
                    if (n % 10 == 0) {
                        w.write("\n" + array[n] + " ");
                    }
                    else
                        w.write(array[n] + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            createNumbersFile();
            createOddNumbersFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

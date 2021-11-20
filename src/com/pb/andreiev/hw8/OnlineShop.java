package com.pb.andreiev.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auth auth = new Auth();
        String login, password, confirmPassword;
        System.out.println("Регистрация");
        System.out.println("Введите login: ");
        login = scanner.nextLine();
        System.out.print("Введите password: ");
        password = scanner.nextLine();
        System.out.print("Повторите password: ");
        confirmPassword = scanner.nextLine();
        int success = 0;
        try {
            auth.signUp(login, password, confirmPassword);
            System.out.println("Регистрация выполнена успешно!");
            success = 1;
        } catch (WrongLoginException | WrongPasswordException s) {
            System.out.println(s.getMessage());
        }
        if (success == 1) {
            System.out.println("Вход на сайт: ");
            System.out.println("Введите login: ");
            login = scanner.nextLine();
            System.out.print("Введите password: ");
            password = scanner.nextLine();
            try {
                auth.signIn(login, password);
                System.out.println("Вход выполнен успешно!");
            } catch (WrongLoginException s) {
                System.out.println(s.getMessage());
            }
        }
    }
}

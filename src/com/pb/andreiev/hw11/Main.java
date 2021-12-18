package com.pb.andreiev.hw11;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(in);
        out.println("Телефонный справочник запущен");
        out.println("Для поиска введите 'search'");
        out.println("Для добавления контакта введите 'add'");
        out.println("Для удаления контакта введите 'remove'");
        out.println("Для отображения списка контактов по ФИО введите 'showByNames'");
        out.println("Для отображения списка контактов по Дате введите 'showByDates'");
        out.println("Для редактирования контакта введите 'edit'");
        out.println("Для записи в файл всех данных введите 'export'");
        out.println("Для загрузки из файла всех данных введите 'import'");
        out.println("Для выхода введите 'esc'");
        String command = scanner.nextLine();
        boolean state = true;
        while (state) {
            switch (command) {
                case "add" -> {
                    phoneBook.Add();
                    out.println("Введите новый запрос: ");
                    command = scanner.nextLine();
                }
                case "search" -> {
                    out.println(phoneBook.Search());
                    out.println("Введите новый запрос: ");
                    command = scanner.nextLine();
                }
                case "remove" -> {
                    phoneBook.Remove();
                    out.println("Введите новый запрос: ");
                    command = scanner.nextLine();
                }
                case "edit" -> {
                    phoneBook.Edit();
                    out.println("Введите новый запрос: ");
                    command = scanner.nextLine();
                }
                case "showByNames" -> {
                    out.println(phoneBook.showByNames());
                    out.println("Введите новый запрос: ");
                    command = scanner.nextLine();
                }
                case "showByDates" -> {
                    out.println(phoneBook.showByDates());
                    out.println("Введите новый запрос: ");
                    command = scanner.nextLine();
                }
                case "export" -> {
                    phoneBook.Export();
                    out.println("Введите новый запрос: ");
                    command = scanner.nextLine();
                }
                case "import" -> {
                    phoneBook.Import();
                    out.println("Введите новый запрос: ");
                    command = scanner.nextLine();
                }
                case "esc" -> {
                    state = false;
                    out.println("Работа телефонной книги завершена");
                }
                default -> {
                    out.println("Неверный запрос. Попробуйте снова.");
                    command = scanner.nextLine();
                }
            }
        }
    }
}
package com.pb.andreiev.hw12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class PhoneBook {
    private final List<Person> phoneBook = new ArrayList<>();

    public void Add() {
        try {
            Scanner scanner = new Scanner(in);
            out.println("Введите ФИО: ");
            String FIO = scanner.nextLine();
            out.println("Введите адрес: ");
            String address = scanner.nextLine();
            out.println("Сколько у пользователя номеров?");
            int size = scanner.nextInt();
            scanner.nextLine();
            String[] phones = new String[size];
            for (int i = 0; i < size; i++) {
                out.println("Введите номер:");
                phones[i] = scanner.nextLine();
            }
            out.println("Введите дату рождения: ");
            String dateOfBirth = scanner.nextLine();
            phoneBook.add(new Person(FIO, address, phones, dateOfBirth, LocalDateTime.now()));
            out.println("Запись создана");
        } catch (Exception e) {
            System.err.println("Ошибка создания пользователя.");
        }
    }

    public void Remove() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите ФИО для поиска: ");
            String str = scan.nextLine();
            String[] p = {"default"};
            Person def = new Person(str, "default", p, "default", LocalDateTime.now());
            for (int i = 0; i < phoneBook.size(); i++) {
                if (phoneBook.get(i).getFIO().equals(def.getFIO()))
                    phoneBook.remove(i);
                System.out.println("Контакт успешно удалён!");
            }
        } catch (Exception e) {
            System.err.println("Ошибка удаления пользователя.");
        }
    }

    public String Search() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ФИО для поиска: ");
        String str = scan.nextLine();
        String[] p = new String[0];
        // создаём дефолтный объект, куда вписываем str
        // и сравниваем значение str со списком пользователей
        Person def = new Person(str, "default", p, "default", LocalDateTime.now());
        for (Person person : phoneBook) {
            if (person.getFIO().equals(def.getFIO()))
                return person.toString();
        }
        return "Пользователь не найден.";
    }

    public void Edit() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите ФИО пользователя для редактирования: ");
            String[] p = new String[0];
            String str = scan.nextLine();
            Person def = new Person(str, "default", p,
                    "default", LocalDateTime.now());
            for (Person person : phoneBook) {
                if (person.getFIO().equals(def.getFIO())) {
                    System.out.println("Пользователь найден.");
                    System.out.println(person);
                    System.out.println("Для изменения ФИО введите 'name'");
                    System.out.println("Для изменения адреса введите 'address'");
                    System.out.println("Для изменения даты рождения введите 'date'");
                    System.out.println("Для изменения номера введите 'phone'");
                    String choice = scan.nextLine();
                    LocalDateTime changes = LocalDateTime.now();
                    switch (choice) {
                        case "name" -> {
                            System.out.println("Введите новое ФИО: ");
                            String newName = scan.nextLine();
                            person.setFIO(newName);
                            person.setDateOfModified(changes);
                            System.out.println("ФИО успешно изменено!");
                        }
                        case "address" -> {
                            System.out.println("Введите новый адрес: ");
                            String newAdress = scan.nextLine();
                            person.setAddress(newAdress);
                            person.setDateOfModified(changes);
                            System.out.println("Адрес успешно изменен!");
                        }
                        case "phone" -> {
                            System.out.println("Сколько номеров у пользователя?");
                            int size = scan.nextInt();
                            for (int n = 0; n < size; n++) {
                                System.out.println("Введите номер: ");
                                scan.nextLine();
                                System.out.println("Номер успешно изменён");
                            }
                        }
                        case "date" -> {
                            System.out.println("Введите новую дату рождения: ");
                            String newDateOfBirth = scan.nextLine();
                            person.setDateOfBirth(newDateOfBirth);
                            person.setDateOfModified(changes);
                            System.out.println("Дата рождения успешно изменена!");
                        }
                        default -> System.out.println("Неверный запрос.");
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Ошибка редактирования пользователя.");
        }
    }

    public String showByNames() {
        Comparator<Person> cmp = Comparator.comparing(Person::getFIO);
        phoneBook.sort(cmp);
        return phoneBook.toString();
    }

    public String showByDates() {
        Comparator<Person> cmp = Comparator.comparing(Person::getAddress);
        phoneBook.sort(cmp);
        return phoneBook.toString();
    }

    public void Export() {
        try {
            File file = Paths.get("phonebook.json").toFile();
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.close();
            System.out.println("Данные успешно экспортированы!");
        } catch (Exception e) {
            System.err.println("Ошибка записи в файл.");
        }
    }

    public void Import() {
        File file = Paths.get("phonebook.json").toFile();
        System.out.println("Данные успешно импортированы!");
    }
}

package com.pb.andreiev.hw5;

public class Library {
    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[0] = new Book("Приключения", "Иванов И. И.", "2000");
        books[1] = new Book("Словарь", "Сидоров А. В.", "1980");
        books[2] = new Book("Энциклопедия ", "Гусев К. В.", "2010");

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В. В", 100, "факультет ",
                "01.10.1994", "+380633280040");
        readers[1] = new Reader("Авдеев А.В.", 101, "факультет",
                "02.10.1994", "+380633280041");
        readers[2] = new Reader("Горев К.М.", 103, "факультет",
                "03.10.1994", "+380633280042");

        // вывод всех книг и читателей
        System.out.println("Книги: ");
        for (Book book : books) {
            System.out.println(book.getBookInfo());
        }
        System.out.println("Читатели: ");
        for (int i = 0; i < readers.length-1; i++) {
            System.out.println(readers[i].getReaderInfo());
        }
        // takeBook()
        System.out.println();
        readers[0].takeBook();
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(books[0], books[1], books[2]);
        // returnBook()
        System.out.println();
        readers[0].returnBook();
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].returnBook(books[0], books[1], books[2]);
    }
}

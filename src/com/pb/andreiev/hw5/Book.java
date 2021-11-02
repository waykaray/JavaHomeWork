package com.pb.andreiev.hw5;

public class Book {
    private static int bookCount = 0;
    public static int getBookCount() {
        return bookCount;
    }
    private String nameOfBook;
    private String authorOfBook;
    private String ageOfBook;

    public Book(String nameOfBook, String authorOfBook, String ageOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
        this.ageOfBook = ageOfBook;
        bookCount++;
    }
    public void setNameOfBook (String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }
    public void setAuthorOfBook (String authorOfBook) {
        this.nameOfBook = authorOfBook;
    }
    public void setAgeOfBook (String ageOfBook) {
        this.nameOfBook = ageOfBook;
    }
    public String setNameOfBook() {
        return nameOfBook;
    }
    public String getNameOfBook() {
        return nameOfBook;
    }
    public String getAuthorOfBook() {
        return authorOfBook;
    }
    public String getAgeOfBook() {
        return ageOfBook;
    }
    public String getBookInfo() {
        return "[Название " + nameOfBook + ", автор: " + authorOfBook + ", рік видання: " + ageOfBook + "]";
    }
}

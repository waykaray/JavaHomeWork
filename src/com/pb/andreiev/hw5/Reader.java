package com.pb.andreiev.hw5;

public class Reader {
    public static int readerCount = 0;

    private String fioUser;
    private int numberTicket;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fioUser, int numberTicket, String faculty, String dateOfBirth, String phoneNumber) {
        this.fioUser = fioUser;
        this.numberTicket = numberTicket ;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        readerCount++;
    }

    public void fioUser(String fioUser) {
        this.fioUser = fioUser;
    }

    public void numberTicket(int numberTicket) {
        this.numberTicket = numberTicket;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFioUser() {
        return fioUser;
    }

    public int getTicket() {
        return numberTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateOfBirthOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void takeBook() {
        System.out.println(getFioUser() + " взяв " + Book.getBookCount() + " книги.");
    }

    public void takeBook(String... titles) {
        System.out.print(getFioUser() + " взяk книги: ");
        for (String title : titles) {
            if (title != titles[titles.length - 1]) {
                System.out.print(title + ", ");
            } else {
                System.out.println(title + ".");
            }
        }
    }

    public void takeBook(Book... books) {
        System.out.print(getFioUser() + " взял книги: ");
        for (Book book : books) {
            if (book != books[books.length - 1]) {
                System.out.print(book.getNameOfBook() + " (" + book.getAuthorOfBook() + ", " + book.getAgeOfBook() + "), ");
            } else {
                System.out.println(book.getNameOfBook() + " (" + book.getAuthorOfBook() + ", " + book.getAgeOfBook() + ").");
            }
        }
    }

    public void returnBook() {
        System.out.println(getFioUser() + " вернул " + Book.getBookCount() + " книги.");
    }

    public void returnBook(String... titles) {
        System.out.print(getFioUser() + " вернул книги: ");
        for (String title : titles) {
            if (title != titles[titles.length - 1]) {
                System.out.print(title + ", ");
            } else {
                System.out.println(title + ".");
            }
        }
    }

    public void returnBook(Book... books) {
        System.out.print(getFioUser() + " вернул книги: ");
        for (Book book : books) {
            if (book != books[books.length - 1]) {
                System.out.print(book.getNameOfBook() + " (" + book.getAuthorOfBook() + ", " + book.getAgeOfBook() + "), ");
            } else {
                System.out.println(book.getNameOfBook() + " (" + book.getAuthorOfBook() + ", " + book.getAgeOfBook() + ").");
            }
        }
    }

    String getReaderInfo() {
        return "[ФИО: " + fioUser + "\nНомер билета: " + numberTicket + "\nФакультет: "
                + faculty + "\nДата рождения: " + dateOfBirth + "\nМобильный: " + phoneNumber + "]";
    }
}

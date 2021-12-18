package com.pb.andreiev.hw11;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Person {
    private String FIO, address;
    private String[] phones;
    private transient String dateOfBirth;
    private transient LocalDateTime dateOfModified;

    public Person(String fullName, String address, String[] phones,
                  String dateOfBirth, LocalDateTime modified) {
        this.FIO = fullName;
        this.address = address;
        this.phones = phones;
        this.dateOfBirth = dateOfBirth;
        this.dateOfModified = modified;
    }
    public Person() {

    }
    public String getFIO() {
        return FIO;
    }

    public String getAddress() {
        return address;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfModified(LocalDateTime dateOfModified) {
        this.dateOfModified = dateOfModified;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FIO='" + FIO + '\'' +
                ", address='" + address + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfModified=" + dateOfModified +
                '}';
    }
}

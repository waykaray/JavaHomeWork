package com.pb.andreiev.hw6;

import java.util.Objects;

public class Cat extends Animal {
    public Cat(String name, String food, String location) {
        super(name, food, location);
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Звук кошки");
    }

    @Override
    public void eat() {
        System.out.println("Кошка кушает " + getFood());
    }
    //Доп поля
    int age = 2;
    //Переопределенные методы toString, equals, hashCode.


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return age == cat.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}

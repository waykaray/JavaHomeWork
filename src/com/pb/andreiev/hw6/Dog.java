package com.pb.andreiev.hw6;

import java.util.Objects;

public class Dog extends Animal {
    public Dog(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Звук собаки");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Собака кушает " + getFood());
    }
    String hogan = "Sasha";

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", hozyain='" + hogan + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(hogan, dog.hogan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hogan);
    }
}

package com.pb.andreiev.hw6;

import java.util.Objects;

public class Horse extends Animal {
    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Звук лошади");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Лошадь кушает " + getFood());
    }

    String color = "black";

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + getName() + '\'' +
                ", food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(color, horse.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}

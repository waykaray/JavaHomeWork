package com.pb.andreiev.hw6;

public class Animal {
    // Первичные переменные
    private String name;
   private String food;
   private String location;

    //Конструктор животных
    public Animal (String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    // Метод издавания звука
    public void makeNoise() {
        System.out.println("Звук животного");
    }
    // Метод кушать
    public void eat() {
        System.out.println("Животное кушает " + food);
    }
    // Метод спать
    public void sleep () {
        System.out.println("Животное спит");
    }
    public String getName() {
        return name;
    }
    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }
}

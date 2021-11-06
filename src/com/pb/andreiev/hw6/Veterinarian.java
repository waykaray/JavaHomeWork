package com.pb.andreiev.hw6;

public class Veterinarian {
    private String name;
    public Veterinarian(String name) {
        this.name = name;
    }
    public static void treatAnimal(Animal animal) {
        System.out.println("Имя животного: " + animal.getName() + ", еда животного: " + animal.getFood() + ", место: " + animal.getLocation());
    }
}

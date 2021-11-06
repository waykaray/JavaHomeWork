package com.pb.andreiev.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {
        Animal cat = new Cat("Барсик", "Рыбка", "Квартира");
        Animal dog = new Dog("Тузик", "Мясо", "Будка");
        Animal horse = new Horse("Маша", "Сено", "Поле");
        Animal[] animals = {horse, cat, dog};
        Class r = Class.forName("com.pb.andreiev.hw6.Veterinarian");
        Constructor constr = r.getConstructor(new Class[] {String.class});
        Object obj = constr.newInstance("Ветеринар");
        if (obj instanceof Veterinarian) {
            for (Animal animal : animals) {
                Veterinarian.treatAnimal(animal);
            }
        }
    }
}

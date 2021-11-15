package com.pb.andreiev.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
    public Tshirt(String name1, Size xxs, String color1, int i) {
        super("name", Size.XS, "color", 1);
    }
    @Override
    public void dressMan() {
        System.out.println();
    }
    @Override
    public void dressWomen() {
        System.out.println();
    }
}

package com.pb.andreiev.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {
    public Pants(String name, Size size, String color, int price) {
        super(name, size, color, price);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}


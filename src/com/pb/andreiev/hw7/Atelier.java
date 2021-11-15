package com.pb.andreiev.hw7;

public class Atelier {
    public static void dressMan(Clothes[] clothes) {
        for (Clothes x : clothes) {
            if (x instanceof ManClothes) {
                System.out.println(
                        "\nТип одежды: " + x.getName() +
                        "\nЦена: " + x.getPrice() +
                        "\nРазмер: " + x.getSize() +
                        "\nЦвет: " + x.getColor());
            }
        }
    }
    public static void dressWomen(Clothes[] clothes) {
        for (Clothes x : clothes) {
            if (x instanceof WomenClothes) {
                System.out.println("\nТип одежды: " + x.getName() +
                        "\nЦена: " + x.getPrice() + " USD" +
                        "\nРазмер: " + x.getSize() +
                        "\nЦвет: " + x.getColor());
            }
        }
    }
    public static void main(String[] args) {
        Clothes tshirt = new Tshirt("name1",Size.XXS,"color1",1);
        Clothes tie = new Tie("name2",Size.S,"color2",2);
        Clothes pants = new Pants("name3",Size.S,"color3",3);
        Clothes skirt = new Skirt("name4",Size.S,"color4", 4);
        Clothes[] Clothes = {tshirt, tie, pants, skirt};

        System.out.println("Мужская одежда: ");
        dressMan(Clothes);
        System.out.println();
        System.out.println("Женская одежда ");
        dressWomen(Clothes);
    }
}

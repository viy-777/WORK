package ru.baranov.task7;

public enum Drink {

    DRINK1(1, "FANTA", 3.45),
    DRINK2(2, "COLA", 4.32),
    DRINK3(3, "SPRITE", 3.15),
    DRINK4(4, "BAIKAL", 1.5);

    int number;
    String name;
    double price;

    Drink(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }
}

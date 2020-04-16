package ru.baranov.task7;

public enum Drinks {

    FANTA(3.45),
    COLA(4.32),
    SPRITE(3.15),
    BAIKAL(1.5);

    // int number;
    // String name;
    double price;

    Drinks(double price) {
        //   this.number = number;
        //  this.name = name;
        this.price = price;
    }
}

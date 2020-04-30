package ru.baranov.task14;

public enum Drinks {

    FANTA(3.45),
    COLA(4.32),
    SPRITE(3.15),
    BAIKAL(1.5);

    double price;

    Drinks(double price) {
        this.price = price;
    }
}

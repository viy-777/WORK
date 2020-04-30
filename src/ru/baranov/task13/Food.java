package ru.baranov.task13;

public enum Food {
    FOOD1("ЙОГУРТ"),
    FOOD2("СУП"),
    FOOD3("СОК"),
    FOOD4("КАША");

    String name;

    Food(String name) {
        this.name = name;
    }
}

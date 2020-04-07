package ru.baranov.task6;

public class Faculty {
    private String name;
    private int number_specialties;

    Faculty(String name, int number_specialties) {
        name = name;//"Физический";
        number_specialties = number_specialties;
    }

    void displayInfo() {
        System.out.println("Факультет: " + name + ", кол-во специальностей: " + number_specialties);
    }
}

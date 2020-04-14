package ru.baranov.task6;

public class Faculty {
    private String name;
    private int numberSpecialties;

    Faculty(String name, int numberSpecialties) {
        this.name = name;
        this.numberSpecialties = numberSpecialties;
    }

    void displayInfo() {
        System.out.println("Факультет: " + name + ", кол-во специальностей: " + numberSpecialties);
    }
}

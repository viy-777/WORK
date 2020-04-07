package ru.baranov.task6;

public class University {
    String name;
    int number_faculties;

    University(String name, int number_faculties) {
        this.name = name;
        this.number_faculties = number_faculties;
    }

    void displayInfo() {
        System.out.println("Университет: " + name + ", кол-во факультетов: " + number_faculties);
    }
}

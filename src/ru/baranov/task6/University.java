package ru.baranov.task6;

public class University {
    private String name;
    private int number_faculties;

    University(String name, int number_faculties) {
        name = name;
        number_faculties = number_faculties;
    }

    void displayInfo() {
        System.out.println("Университет: " + name + ", кол-во факультетов: " + number_faculties);
    }
}

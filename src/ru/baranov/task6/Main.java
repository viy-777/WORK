package ru.baranov.task6;

public class Main {
    public static void main(String[] args) {

        University u = new University();
        System.out.println("Университет: " + u.getName() + ", кол-во факультетов: " + u.getNumber_faculties());

        Faculty f = new Faculty("Физический", 27);
        f.displayInfo();

        Specialty s = new Specialty();
        s.setName("Геология");
        s.setMark(99);
        System.out.println("Специальность: " + s.getName() + ", проходной балл: " + s.getMark());


    }
}



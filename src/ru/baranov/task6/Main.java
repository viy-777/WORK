package ru.baranov.task6;

public class Main {
    public static void main(String[] args) {

        University MGU = new University("МГУ", 45);
        MGU.displayInfo();

        Faculty f = new Faculty("Физический", 27);
        f.displayInfo();

        Specialty s = new Specialty("Биофизика", 95);
        s.setName("Геология");
        System.out.println("Специальность: " + s.getName() + ", проходной балл: " + s.getMark());
    }
}



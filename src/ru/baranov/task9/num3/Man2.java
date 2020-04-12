package ru.baranov.task9.num3;

public class Man2 extends Man {
    private int age;

    public Man2(String name, String nationality, int age) {
        super(name, nationality);
        this.age = age;
    }

    public void run() {
        System.out.printf("Имя бегуна: %s, национальность: %s, возраст: %d \n", super.getName(), super.getNationality(), age);
    }

}

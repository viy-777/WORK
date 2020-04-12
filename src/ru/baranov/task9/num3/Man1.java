package ru.baranov.task9.num3;

public class Man1 extends Man {
    private int age;

    public Man1(String name, String nationality, int age) {
        super(name, nationality);
        this.age = age;
    }

    public void Info() {
        System.out.printf("Имя: %s, национальность: %s, возраст: %d \n", super.getName(), super.getNationality(), age);
    }

}

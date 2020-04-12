package ru.baranov.task9.num3;

public class Man3 extends Man {
    private int age;

    public Man3(String name, String nationality, int age) {
        super(name, nationality);
        this.age = age;
    }

    public void swim() {
        System.out.printf("Имя пловца: %s, национальность: %s, возраст: %d \n", super.getName(), super.getNationality(), age);
    }

}

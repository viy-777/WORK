package ru.baranov.task9;

//Написать абстрактный класс Animal с абстрактным методом getName.
//Сделать несколько классов животных, наследников Animal.
//Метод getName должен выводит название каждого животного.

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void display();
}

class Animal1 extends Animal {
    private String name1;

    public Animal1(String name) {
        super(name);
        this.name1 = name;
    }

    @Override
    public void display() {
        System.out.printf("Животное1: %s \n", super.getName());
    }
}

class Animal2 extends Animal {
    private String name2;

    public Animal2(String name) {
        super(name);
        this.name2 = name;
    }

    @Override
    public void display() {
        System.out.printf("Животное2: %s \n", super.getName());
    }
}

class Animal3 extends Animal {
    private String name3;

    public Animal3(String name) {
        super(name);
        this.name3 = name;
    }

    @Override
    public void display() {
        System.out.printf("Животное3: %s \n", super.getName());
    }
}

public class NumberFirst {
    public static void main(String[] args) {
        Animal1 a1 = new Animal1("Утка");
        Animal2 a2 = new Animal2("Леопард");
        Animal3 a3 = new Animal3("Бобер");

        a1.display();
        a2.display();
        a3.display();
    }
}
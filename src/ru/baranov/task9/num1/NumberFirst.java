package ru.baranov.task9.num1;

//Написать абстрактный класс Animal с абстрактным методом getName.
//Сделать несколько классов животных, наследников Animal.
//Метод getName должен выводит название каждого животного.

class Animal1 extends Animal {

    public Animal1(String name) {
        super("Сурок");
    }

    @Override
    public void display() {
        System.out.printf("Животное 1: %s \n", getName());
    }


}

class Animal2 extends Animal {

    public Animal2(String name) {
        super("Суслик");
    }

    @Override
    public void display() {
        System.out.printf("Животное 2: %s \n", getName());
    }
}

class Animal3 extends Animal {

    public Animal3(String name) {
        super("Волк");
    }

    @Override
    public void display() {
        System.out.printf("Животное 3: %s \n", getName());
    }
}

public class NumberFirst {
    public static void main(String[] args) {
    }
}
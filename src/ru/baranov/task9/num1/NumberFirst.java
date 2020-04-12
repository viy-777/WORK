package ru.baranov.task9.num1;

//Написать абстрактный класс Animal с абстрактным методом getName.
//Сделать несколько классов животных, наследников Animal.
//Метод getName должен выводит название каждого животного.

class Animal1 extends Animal {
    private int number;

    public Animal1(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public void display() {
        System.out.printf("Животное " + number + ": %s \n", super.getName());
    }

}

class Animal2 extends Animal {

    private int number;

    public Animal2(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public void display() {
        System.out.printf("Животное " + number + ": %s \n", super.getName());
    }
}

class Animal3 extends Animal {

    private int number;

    public Animal3(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public void display() {
        System.out.printf("Животное " + number + ": %s \n", super.getName());
    }
}

public class NumberFirst {
    public static void main(String[] args) {
        Animal1 a1 = new Animal1("Сурок", 1);
        a1.display();

        Animal1 a2 = new Animal1("Волк", 2);
        a2.display();

        Animal1 a3 = new Animal1("Лиса", 3);
        a3.display();
    }
}
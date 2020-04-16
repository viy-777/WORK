package ru.baranov.task9.num1;

//Написать абстрактный класс Animal с абстрактным методом getName.
//Сделать несколько классов животных, наследников Animal.
//Метод getName должен выводит название каждого животного.

class Animal1 extends Animal {
    private int number;

    public Animal1(int number) {
        this.number = number;
    }

    public void getName() {
        System.out.println("Животное " + number + ": Лев");
    }
}

class Animal2 extends Animal {
    private int number;

    public Animal2(int number) {
        this.number = number;
    }

    public void getName() {
        System.out.println("Животное " + number + ": Енот");
    }
}

class Animal3 extends Animal {
    private int number;

    public Animal3(int number) {
        this.number = number;
    }

    public void getName() {
        System.out.println("Животное " + number + ": Собака");
    }
}

public class NumberFirst {
    public static void main(String[] args) {
        Animal1 a1 = new Animal1(1);
        a1.getName();

        Animal2 a2 = new Animal2(2);
        a2.getName();

        Animal3 a3 = new Animal3(3);
        a3.getName();
    }
}

package ru.baranov.task9.num2;

//Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
// Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
// Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).

interface FLyable {
    void fly();
}

interface Runnable {
    void run();
}

interface Swimmable {
    void swim();
}


class AnimalFirst implements FLyable {
    String name;

    AnimalFirst(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.printf("Летающее животное: %s \n", name);
    }
}

class AnimalSecond implements Runnable {
    String name;

    AnimalSecond(String name) {
        this.name = name;
    }

    public void run() {
        System.out.printf("Бегающее животное: %s \n", name);
    }
}

class AnimalThird implements Runnable, Swimmable {
    String name;

    AnimalThird(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.printf("Плавающее животное: %s \n", name);
    }

    public void run() {
        System.out.printf("Бегающее животное: %s \n", name);
    }
}

public class NumberSecond {
    public static void main(String[] args) {
        AnimalFirst a1 = new AnimalFirst("Орел");
        a1.fly();

        AnimalSecond a2 = new AnimalSecond("Курица");
        a2.run();

        AnimalThird a3 = new AnimalThird("Бобер");
        a3.swim();
        a3.run();
    }
}
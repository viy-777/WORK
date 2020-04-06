package ru.baranov.task9;

//Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
// Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
// Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).

interface FLy {
    void fly_();
}

interface Run {
    void run_();
}

interface Swim {
    void swim_();
}


class An1 implements FLy {
    String name;

    An1(String name) {
        this.name = name;
    }

    public void fly_() {
        System.out.printf("Летающее животное: %s \n", name);
    }
}

class An2 implements Run {
    String name;

    An2(String name) {
        this.name = name;
    }

    public void run_() {
        System.out.printf("Бегающее животное: %s \n", name);
    }
}

class An3 implements Run, Swim {
    String name;

    An3(String name) {
        this.name = name;
    }

    public void swim_() {
        System.out.printf("Плавающее животное: %s \n", name);
    }

    public void run_() {
        System.out.printf("Бегающее животное: %s \n", name);
    }
}

public class NumberSecond {
    public static void main(String[] args) {
        An1 a1 = new An1("Ящерица");
        a1.fly_();

        An2 a2 = new An2("Курица");
        a2.run_();

        An3 a3 = new An3("Бобер");
        a3.swim_();
        a3.run_();
    }
}
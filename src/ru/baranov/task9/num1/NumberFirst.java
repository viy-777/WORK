package ru.baranov.task9.num1;

//Написать абстрактный класс Animal с абстрактным методом getName.
//Сделать несколько классов животных, наследников Animal.
//Метод getName должен выводит название каждого животного.

class Animal1 extends Animal {
    //  private String name;

    public Animal1(String name) {
        super(name);
    }

    {
        setName("Сурок");
    }

    @Override
    public void display() {
        System.out.printf("Животное1: %s \n", getName());
    }
}

class Animal2 extends Animal {
    private String name;

    public Animal2(String name) {
        super(name);
    }

    {
        setName("Суслик");
    }

    @Override
    public void display() {
        System.out.printf("Животное2: %s \n", getName());
    }
}

class Animal3 extends Animal {
    private String name;

    public Animal3(String name) {
        super(name);
    }

    {
        setName("Волк");
    }

    @Override
    public void display() {
        System.out.printf("Животное3: %s \n", getName());
    }
}

public class NumberFirst {
    public static void main(String[] args) {
        Animal a1 = new Animal1("");
        Animal a2 = new Animal2("");
        Animal a3 = new Animal3("");

        a1.display();
        a2.display();
        a3.display();
    }
}
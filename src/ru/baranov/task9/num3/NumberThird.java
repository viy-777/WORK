package ru.baranov.task9.num3;

//Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
//Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.

interface Runnable {
    void running();

    void chempRunning();
}

interface Swimmable {
    void swimming();

    void chempSwimming();
}

abstract class Man implements Runnable, Swimmable {
    private String name;                                   //поля
    private int age;                                       //поля

    Man(String name, int age) {                      //создание конструктора с параметрами
        this.name = name;
        this.age = age;
    }

    public void running() {
        System.out.printf("Бегун с именем %s (возраст %d) \n", name, age);
    }

    public void chempRunning() {
        System.out.printf("Чемпион по бегу %s (возраст %d) \n", name, age);
    }

    public void swimming() {
        System.out.printf("Пловец с именем %s (возраст %d) \n", name, age);
    }

    public void chempSwimming() {
        System.out.printf("Чемпион по плаванию %s (возраст %d) \n", name, age);
    }

}

public class NumberThird {
    public static void main(String[] args) {

        /*Man m1 = new Man("Егор", 44);
        m1.running();

        Man m2 = new Man("Татьяна", 23);
        m2.chempRunning();

        Man m3 = new Man("Джон", 30);
        m3.swimming();

        Man m4 = new Man("Сергей", 24);
        m4.chempSwimming();*/
    }
}

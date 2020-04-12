package ru.baranov.task9.num3;

//Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
//Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.

public class NumberThird {
    public static void main(String[] args) {

        Runnable m1 = new Man1("Педро", "перуанец", 45);
        m1.run();
        Runnable m2 = new Man2("Сергей", "русский", 22);
        m2.run();
        Swimmable m3 = new Man3("Лука", "хорват", 27);
        m3.swim();
    }
}

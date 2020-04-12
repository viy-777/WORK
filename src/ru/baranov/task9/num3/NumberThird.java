package ru.baranov.task9.num3;

//Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
//Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.

public class NumberThird {
    public static void main(String[] args) {

        Man1 m1 = new Man1("", "");
        m1.running();

        /*Man m2 = new Man("Татьяна", 23);
        m2.chempRunning();

        Man m3 = new Man("Джон", 30);
        m3.swimming();

        Man m4 = new Man("Сергей", 24);
        m4.chempSwimming();*/
    }
}

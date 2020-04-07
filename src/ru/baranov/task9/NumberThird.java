package ru.baranov.task9;

//Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
//Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.

interface Run_ {
    void running();

    void chemp_running();
}

interface Swim_ {
    void swimming();

    void chemp_swimming();
}

class Man implements Run_, Swim_ {
    String name;                                   //поля
    int age;                                       //поля

    Man(String name, int age) {                      //создание конструктора с параметрами
        this.name = name;
        this.age = age;
    }

    public void running() {
        System.out.printf("Бегун с именем %s (возраст %d) \n", name, age);
    }

    public void chemp_running() {
        System.out.printf("Чемпион по бегу %s (возраст %d) \n", name, age);
    }

    public void swimming() {
        System.out.printf("Пловец с именем %s (возраст %d) \n", name, age);
    }

    public void chemp_swimming() {
        System.out.printf("Чемпион по плаванию %s (возраст %d) \n", name, age);
    }

}

public class NumberThird {
    public static void main(String[] args) {
        Man m1 = new Man("Егор", 44);
        m1.running();

        Man m2 = new Man("Татьяна", 23);
        m2.chemp_running();

        Man m3 = new Man("Джон", 30);
        m3.swimming();

        Man m4 = new Man("Сергей", 24);
        m4.chemp_swimming();
    }
}

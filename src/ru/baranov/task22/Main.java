package ru.baranov.task22;

//Написать класс PersonSuperComparator,
//который имплементит Comparator, но умеет сравнивать по двум параметрам , возраст и имя.
//Класс Person теперь содержит два поля int age и String name

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person(42, "Иван"));
        persons.add(new Person(18, "Юлия"));
        persons.add(new Person(18, "Олег"));
        persons.add(new Person(19, "Андрей"));

        for (Person person : persons)
            System.out.println(person.toString());
        System.out.println();

        persons.sort(new PersonSuperComparator());
        System.out.println("Сортировка по возрасту и имени: ");
        for (Person person : persons) {
            System.out.println(person);
        }


    }
}

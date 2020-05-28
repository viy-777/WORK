package ru.baranov.task24;

//Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
//public Set<String> removeEvenLength(Set<String> set);
//Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
// метод вернет ["foo", "bar", "spoon", "!"]


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> beginset = new HashSet<>();
        beginset.add("dfg");
        beginset.add("dfgv");
        beginset.add("sf");
        beginset.add("dfffv");
        beginset.add("dfew");

        System.out.println("Исходные слова:");
        beginset.forEach(System.out::println);

        System.out.println("Слова с нечетной длиной:");

        Set endset = new HashSet<>();
        endset = RemoveEvenLength.removeEvenLength(beginset);

        beginset.forEach(System.out::println);
    }
}

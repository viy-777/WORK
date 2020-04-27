package ru.baranov.task13;

public class Child {
    public static boolean unpalatable;

    public static void eat(int food) {
        if ((food == 1) || (food == 3)) {
            unpalatable = false;
            System.out.println("Cпасибо. Cъел … за обе щеки");
        } else {
            if ((food == 2) || (food == 4)) {
                unpalatable = true;
                System.out.println("Cпасибо. Не хочу");
            }
        }
    }
}
package ru.baranov.task8.num3;

public class NumberThird {
    public static void main(String[] args) {
        Count c1 = new Count();

        Count c2 = new Count(1);

        Count c3 = new Count("a");

        Count c4 = new Count(45, "b");

        c1.Info();
    }
}


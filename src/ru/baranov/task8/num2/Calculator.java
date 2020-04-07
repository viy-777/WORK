package ru.baranov.task8.num2;

import java.util.Scanner;

public class Calculator {

    static double var1 = 0, var2 = 0;
    static String act = "";

    public static void Count() {
        System.out.println("Введите первое число:");
        Scanner in = new Scanner(System.in);
        var1 = in.nextDouble();

        System.out.println("Введите второе число:");
        var2 = in.nextDouble();

        System.out.println("Введите действие:");
        act = in.next();

        switch (act) {
            case ("-"):
                System.out.println("Результат вычитания: " + var1 + " " + act + " " + var2 + " = " + (var1 - var2));
                break;
            case ("+"):
                System.out.println("Результат сложения: " + var1 + " " + act + " " + var2 + " = " + (var1 + var2));
                break;
            case ("*"):
                System.out.println("Результат умножения: " + var1 + " " + act + " " + var2 + " = " + (var1 * var2));
                break;
            case ("/"):
                System.out.println("Результат деления: " + var1 + " " + act + " " + var2 + " = " + (var1 / var2));
                break;
            case ("%"):
                System.out.println("Результат вычисления процента: " + var1 + " от " + var2 + " = " + (var1 * 100 /
                        var2) + "%");
                break;
        }
    }
}

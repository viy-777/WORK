package ru.baranov.task8;

import java.util.Scanner;

class Calculator {
    private static double var1 = 0, var2 = 0;
    private static String act = "";

    public static String getAct() {
        return act;
    }

    public void Count() {
        System.out.println("Введите первое число:");
        Scanner in = new Scanner(System.in);
        var1 = in.nextDouble();

        System.out.println("Введите второе число:");
        var2 = in.nextDouble();

        System.out.println("Введите действие:");
        act = in.next();

        switch (Calculator.getAct()) {                                                                                    //обращение к статической переменной класса Calculator
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
                System.out.println("Результат вычисления процента: " + var1 + " " + act + " " + var2 + " = " + (var1 * 100 / var2) + "%");
                break;
            default:
        }
        return;


    }
}

public class NumberSecond {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.Count();
    }
}

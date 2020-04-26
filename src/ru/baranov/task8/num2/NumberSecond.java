package ru.baranov.task8.num2;

//Реализовать класс Calculator, который будет содержать статические методы для операций вычитания, сложения,
//умножения, деления и взятия процента от числа.
//Класс должен работать как с целыми числами, так и с дробями.

import java.util.Scanner;

public class NumberSecond {

    public static void main(String[] args) {

        double var1, var2;
        String action;

        System.out.println("Введите первое число:");
        Scanner in = new Scanner(System.in);
        var1 = in.nextDouble();

        System.out.println("Введите второе число:");
        var2 = in.nextDouble();

        System.out.println("Введите действие:");
        action = in.next();

        switch (action) {
            case "+":
                Calculator.countPlus(var1, var2);
                break;
            case "-":
                Calculator.countMinus(var1, var2);
                break;
            case "*":
                Calculator.countMul(var1, var2);
                break;
            case "/":
                Calculator.countDiv(var1, var2);
                break;
            case "%":
                Calculator.countProc(var1, var2);
                break;
        }

        System.out.println(var1 + " " + " " + action + " " + var2 + " = " + Calculator.res);
    }
}

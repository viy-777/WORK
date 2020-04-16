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

        if (action.equals("+")) Calculator.countPlus(var1, var2);
        else if (action.equals("-")) Calculator.countMinus(var1, var2);
        else if (action.equals("*")) Calculator.countMul(var1, var2);
        else if (action.equals("/")) Calculator.countDiv(var1, var2);
        else if (action.equals("%")) Calculator.countProc(var1, var2);

        System.out.println(var1 + " " + " " + action + " " + var2 + " = " + Calculator.getRes());
    }
}

package ru.baranov.task8.num2;

//Реализовать класс Calculator, который будет содержать статические методы для операций вычитания, сложения,
//умножения, деления и взятия процента от числа.
//Класс должен работать как с целыми числами, так и с дробями.

import java.util.Scanner;

public class NumberSecond {

    public static void main(String[] args) {

        double var1, var2, res;
        String action;

        System.out.println("Введите первое число:");
        Scanner in = new Scanner(System.in);
        var1 = in.nextDouble();

        System.out.println("Введите второе число:");
        var2 = in.nextDouble();

        System.out.println("Введите действие:");
        action = in.next();

        Calculator.setVar1(var1);
        Calculator.setVar2(var2);
        Calculator.setAction(action);

        if (action.equals("+")) Calculator.countPlus();
        else if (action.equals("-")) Calculator.countMinus();
        else if (action.equals("*")) Calculator.countMul();
        else if (action.equals("/")) Calculator.countDiv();
        else if (action.equals("%")) Calculator.countProc();

        System.out.println(Calculator.getVar1() + " " + " " + Calculator.getAction() + " " + Calculator.getVar2() + " = " + Calculator.getRes());
    }
}

package ru.baranov.task8.num2;

public class Calculator {

    private static double var1, var2, res;
    private static String action;

    public static double getVar1() {
        return var1;
    }

    public static double getVar2() {
        return var2;
    }

    public static String getAction() {
        return action;
    }

    public static double getRes() {
        return res;
    }

    public static void setVar1(double var1) {
        Calculator.var1 = var1;
    }

    public static void setVar2(double var2) {
        Calculator.var2 = var2;
    }

    public static void setAction(String action) {
        Calculator.action = action;
    }

    public static void countPlus() {
        res = var1 + var2;
    }

    public static void countMinus() {
        res = var1 - var2;
    }

    public static void countDiv() {
        res = var1 / var2;
    }

    public static void countMul() {
        res = var1 * var2;
    }

    public static void countProc() {
        res = (var1 * 100) / var2;
    }
}

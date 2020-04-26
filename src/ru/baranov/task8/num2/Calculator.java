package ru.baranov.task8.num2;

public class Calculator {
    public static double res;

    public static void countPlus(double var1, double var2) {
        res = var1 + var2;
    }

    public static void countMinus(double var1, double var2) {
        res = var1 - var2;
    }

    public static void countDiv(double var1, double var2) {
        res = var1 / var2;
    }

    public static void countMul(double var1, double var2) {
        res = var1 * var2;
    }

    public static void countProc(double var1, double var2) {
        res = (var1 * 100) / var2;
    }

}

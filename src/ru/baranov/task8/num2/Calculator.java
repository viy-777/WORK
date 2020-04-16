package ru.baranov.task8.num2;

public class Calculator {
    private static double res;
    private static String action;

    public static double getRes() {
        return res;
    }

    public static double countPlus(double var1, double var2) {
        return res = var1 + var2;
    }

    public static double countMinus(double var1, double var2) {
        return res = var1 - var2;
    }

    public static double countDiv(double var1, double var2) {
        return res = var1 / var2;
    }

    public static double countMul(double var1, double var2) {
        return res = var1 * var2;
    }

    public static double countProc(double var1, double var2) {
        return res = (var1 * 100) / var2;
    }
}

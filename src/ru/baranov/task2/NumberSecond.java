package ru.baranov.task2;

public class NumberSecond {
    public static void main(String[] args) {

        double zp = 85000.0, zp_;
        int tax;

        tax = 13;
        zp_ = zp - zp*tax/100;
        System.out.println("Зарплата за вычетом налога: " + zp_ + " руб.");
    }
}

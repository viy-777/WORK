package ru.baranov.task21_2;

//Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
//
//Задачу не зачитывать если использованы утильные методы класса Arrays. Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы.
//
//Вывести массив в консоль до и после вызова метода по реверсу массива

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива:");
        int length = in.nextInt();

        MyArray2.makeArray(length);
        MyArray2.reverse();
    }
}

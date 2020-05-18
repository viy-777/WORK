package ru.baranov.task21_2;

//Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
//
//Задачу не зачитывать если использованы утильные методы класса Arrays. Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы.
//
//Вывести массив в консоль до и после вызова метода по реверсу массива

import ru.baranov.task21_1.MyArray;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyArray2 myArray2 = new MyArray2();
        myArray2.reverse();
    }
}

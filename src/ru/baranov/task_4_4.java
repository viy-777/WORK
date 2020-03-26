package ru.baranov;

//Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.

import java.util.Scanner;

public class task_4_4 {

    public static void main(String[] args) {

        System.out.println("Программа, которая выводит арифметическую или геометрическую прогрессию для N чисел");

        int num1 = 0, num2 = 0, d = 0, m = 0;

        System.out.println("Введите первый член прогрессии:");   //ввод пользователем числа
        Scanner in = new Scanner(System.in);

        num1 = in.nextInt();

        System.out.println("Введите число членов:");   //ввод пользователем числа
        num2 = in.nextInt();

        System.out.println("Введите разность арифметической прогрессии:");   //ввод пользователем числа
        d = in.nextInt();

        for (int i = num1, j = num1; i < num1 + num2; i++, j += d)
            System.out.println(j);   //вывод арифметической прогрессии для num2 чисел

        System.out.println("Введите знаменатель геометрической прогрессии:");   //ввод пользователем числа
        m = in.nextInt();

        for (int i = num1, j = num1; i < num1 + num2; i++, j *= m)
            System.out.println(j);   //вывод геометрической прогрессии для num2 чисел
    }
}


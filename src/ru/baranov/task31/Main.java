package ru.baranov.task31;

//Палиндром - это слово, фраза, число или другая последовательность символов или элементов, которая читает то же самое вперед или назад.
//Например: 12121 - палиндром, так как он читает то же самое вперед или назад. мадам тоже палиндром.
//Требуется написать 2 реализации проверки строки на палиндром:
//Перемещение с обоих концов строки одновременно
//Используя стандартные функции строки

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text1 = "Да, пот – сила баб. А листопад?";
        String text2 = "Доброго вечера, друг!";

        System.out.println("Выберите текст: '" + text1 + "'(1)/ '" + text2 + "'(2)");
        int vartext = in.nextInt();
        String text = "";
        if (vartext == 1) {
            text = text1;
        } else if (vartext == 2) {
            text = text2;
        }

        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println("Метод №1: " + isPalindrome.isPalindrome1(text));
        System.out.println("Метод №2: " + isPalindrome.isPalindrome2(text));
    }
}
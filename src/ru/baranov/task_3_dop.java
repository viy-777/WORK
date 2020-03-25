package ru.baranov;

//Написать консольное Java-приложение «Горячо-Холодно»

import java.util.Random;                                                  //подклюение библиотеки
import java.util.Scanner;

public class task_3_dop {

    public static void main(String[] args) {
        int min = 0;                                                     //минимум
        int max = 100;                                                   //максимум
        int diff = max - min;                                            //диапазон
        Random random = new Random();                                   //инициализация рандома
        int i = random.nextInt(diff + 1);                        // генерирация целого числа, включая max
        i += min;
        //System.out.println("Случайное число в диапазоне 0..100: " + i);

        int num = 0;                                    //ввод пользователем числа
        System.out.println("Введите число от 0 до 100 (для выхода введите '0'):");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        boolean gameover = true;

        while (gameover == true) {
            int dif = Math.abs((i - num));
            if (num == 0) {                               //принудительное завершение цикла
                gameover = false;
                break;
            } else if (num == i) {                         //условие правильного ввода числа
                System.out.println("Вы угадали число!");
                gameover = false;
                break;
            } else {
                if (dif <= 10) {
                    System.out.println("Горячо! Введите число от 0 до 100 (для выхода введите '0'):"); //условие ввода числа, близкого к загаданному
                    num = in.nextInt();
                }
                if (dif > 10) {
                    System.out.println("Холодно! Введите число от 0 до 100 (для выхода введите '0'):"); //условие ввода числа, близкого к загаданном
                    num = in.nextInt();
                }
            }
        }
    }
}
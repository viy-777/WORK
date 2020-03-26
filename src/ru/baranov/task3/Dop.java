package ru.baranov.task3;

import java.util.Random;
import java.util.Scanner;

public class Dop {

    public static void main(String[] args) {
        int min = 0, max = 100, diff = max - min;
        Random random = new Random();                                   //инициализация рандома
        int i = random.nextInt(diff + 1);                        // генерирация целого числа, включая max
        i += min;
        System.out.println("Случайное число в диапазоне 0..100: " + i);

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

package ru.baranov.task3;

import javax.swing.*;
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
        int dif1 = 0, dif2 = 100, count = 0;
        String fact;

        while (gameover == true) {
             if (num == 0) {                               //принудительное завершение цикла
                gameover = false;
                break;
            } else if (num == i) {                         //условие правильного ввода числа
                System.out.println("Вы угадали число!");
                gameover = false;
                break;
            } else {                                       //если введено неверное число
                if (count == 0) {                          //первая проверка неверного числа
                    dif1 = Math.abs((i - num));            //разница до истинного значения при первом вводе

                    {if (dif1 < dif2) {fact = "Горячо!";}
                    else {fact = "Холодно!";}}

                    System.out.println(fact + " Введите число от 0 до 100 (для выхода введите '0'):");
                    num = in.nextInt();

                    count = 1;
                }
                else     {                                  //вторая проверка неверного числа
                    dif2 = Math.abs((i - num));            //разница до истинного значения при втором вводе

                    {if (dif2 < dif1) {fact = "Горячо!";}
                    else {fact = "Холодно!";}}

                    System.out.println(fact + " Введите число от 0 до 100 (для выхода введите '0'):");
                        num = in.nextInt();

                    count = 0;
                    }

            }
    }
    }
}
package ru.baranov.task3;

import java.util.Random;
import java.util.Scanner;

public class DopZad {

    public static void main(String[] args) {
        int min = 0, max = 100, diff = max - min;
        Random random;
        random = new Random();
        int i = random.nextInt(diff + 1);                        // генерирация целого числа, включая max
        i += min;

        int num = 0;                                    //ввод пользователем числа
        System.out.println("Введите число от 0 до 100 (для выхода введите '0'):");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        int dif1 = 0, dif2 = 100, count = 0;
        String fact;

        while (true) {
            if (num == 0) {                                //принудительный выход из программы
                break;
            }
            if (num == i) {                           //правильный ввод числа
                System.out.println("Вы угадали число!");
                break;
            }
            {                                         //если введено неверное число
                if (count == 0) {                          //первая проверка неверного числа
                    dif1 = Math.abs((i - num));            //разница до истинного значения при первом вводе

                    {
                        if (dif1 < dif2) {
                            fact = "Горячо!";
                        } else {
                            fact = "Холодно!";
                        }
                    }

                    System.out.println(fact + " Введите число от 0 до 100 (для выхода введите '0'):");
                    num = in.nextInt();

                    count = 1;
                } else {                                  //вторая проверка неверного числа
                    dif2 = Math.abs((i - num));            //разница до истинного значения при втором вводе

                    {
                        if (dif2 < dif1) {
                            fact = "Горячо!";
                        } else {
                            fact = "Холодно!";
                        }
                    }

                    System.out.println(fact + " Введите число от 0 до 100 (для выхода введите '0'):");
                    num = in.nextInt();

                    count = 0;
                }

            }
        }
    }
}

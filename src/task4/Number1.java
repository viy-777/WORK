package task4;

import java.util.Scanner;

public class Number1 {

    public static void main(String[] args) {

        System.out.println("Программа для поиска минимального из двух чисел");

        int num1 = 0, num2 = 0;

        System.out.println("Введите первое число:");   //ввод пользователем числа №1
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();

        System.out.println("Введите второе число:");   //ввод пользователем числа №2
        num2 = in.nextInt();

        if (num1 > num2) System.out.println("Первое число больше второго");
        if (num1 < num2) System.out.println("Первое число меньше второго");
        if (num1 == num2) System.out.println("Первое число равно второму");
    }
}

package task4;

import java.util.Scanner;

public class Number2 {

    public static void main(String[] args) {

        System.out.println("Программа, описывающее введенное число");

        int num = 0;
        boolean even;

        System.out.println("Введите первое число:");   //ввод пользователем числа
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if (num % 2 == 0) even = true;                //проверка на четность
        else
            even = false;

        if (even) {
            if (num > 0) System.out.println("Число положительное, четное");
            if (num < 0) System.out.println("Число отрицательное, четное");}
        else {
            if (num > 0) System.out.println("Число положительное, нечетное");
            if (num < 0) System.out.println("Число отрицательное, нечетное");}

        if (num == 0) System.out.println("Число нулевое");
    }
}

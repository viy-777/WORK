package ru.baranov.task21_1;

//Дан двумерный массив. Задача – написать метод
//
//public void toLeft() {}
//1.Пройти с 1-ой до последней строки
//2.Пройти с 1-го до предпоследнего элемента
//3.В текущую ячейку поместить значение следующей
//4.Последнему элементу присвоить 0

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите кол-во строк двумерного массива:");
        int numLines = in.nextInt();
        System.out.println("Введите кол-во столбцов двумерного массива:");
        int numColumnes = in.nextInt();

        MyArray.makeArray(numLines, numColumnes);

        System.out.println("Введите кол-во элементов для сдвига массива влево:");
        int shearSize = in.nextInt();
        MyArray.toLeft(shearSize);

    }
}
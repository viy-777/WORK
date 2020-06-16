package ru.baranov.task21_1;

//Дан двумерный массив. Задача – написать метод
//public void toLeft() {}
//1.Пройти с 1-ой до последней строки
//2.Пройти с 1-го до предпоследнего элемента
//3.В текущую ячейку поместить значение следующей
//4.Последнему элементу присвоить 0

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[][] initialArray = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println("Первоначальный массив:" + Arrays.deepToString(initialArray));

        MyArray myArray = new MyArray(initialArray);
        myArray.toLeft();
        System.out.println("Массив после процедуры сдвига на один элемент:" + Arrays.deepToString(myArray.getMyArray()));
    }
}
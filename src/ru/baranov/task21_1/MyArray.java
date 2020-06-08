package ru.baranov.task21_1;

import java.util.*;

public class MyArray {
    protected static int[][] myArray;

    public static void makeArray(int numLines, int numColumnes) {
        Scanner in = new Scanner(System.in);
        myArray = new int[numLines][numColumnes];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numColumnes; j++) {
                myArray[i][j] = in.nextInt();
            }
        }
        MyArray.print();
    }

    public static void print() {
        System.out.println("Массив:" + Arrays.deepToString(myArray));
    }

    public static void toLeft(int shearSize) {
        int[] arrayTemp = new int[shearSize];

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i - shearSize] = myArray[i];
                myArray[i][j] = myArray[i][j + 1];
            }
        }
        System.out.println("После процедуры сдвига:");
        MyArray.print();
    }
}
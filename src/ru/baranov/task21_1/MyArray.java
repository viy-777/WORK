package ru.baranov.task21_1;

import java.lang.reflect.Array;

public class MyArray {
    int[][] myArray = {{5, 4, 99}, {3, 7, 44}, {77, 13, 51}};

    public void toLeft() {
        System.out.println("Двумерный массив:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(" " + myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        myArray[myArray.length - 1][myArray.length - 2] = myArray[myArray.length - 1][myArray.length - 1];
        myArray[myArray.length - 1][myArray.length - 1] = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

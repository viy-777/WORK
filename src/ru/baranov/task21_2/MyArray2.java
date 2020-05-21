package ru.baranov.task21_2;

import java.util.*;

public class MyArray2 {

    protected static int[] myArray;

    public static void makeArray(int length) {
        Scanner in = new Scanner(System.in);
        myArray = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            myArray[i] = in.nextInt();
        }
        MyArray2.print();
    }

    public static void print() {
        System.out.println("Массив:" + Arrays.toString(MyArray2.myArray));
    }

    public static void reverse() {
        int n = myArray.length;
        for (int i = 0; i < n / 2; i++) {
            int tempVar = myArray[n - i - 1];
            myArray[n - i - 1] = myArray[i];
            myArray[i] = tempVar;
        }
        System.out.println("После процедуры реверса:");
        MyArray2.print();
    }
}

package ru.baranov.task21_2;

public class MyArray2 {
    int[] myArray = {5, 4, 99, 3, 7, 44, 77, 13, 51};

    public void reverse() {
        for (int value : myArray) {
            System.out.print(value + " ");
        }

        System.out.println();

        int n = myArray.length;
        int tempVar;
        for (int i = 0; i < n / 2; i++) {
            tempVar = myArray[n - i - 1];
            myArray[n - i - 1] = myArray[i];
            myArray[i] = tempVar;
        }
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }
}

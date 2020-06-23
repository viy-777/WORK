package ru.baranov.task21_1;

public class MyArray {
    private int[][] myArray;

    MyArray(int[][] myArray) {
        this.myArray = myArray;
    }

    public int[][] getMyArray() {
        return myArray;
    }

    public void toLeft() {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length - 1; j++) {
                myArray[i][j] = myArray[i][j + 1];
            }
            myArray[i][myArray[i].length - 1] = 0;
        }
    }
}

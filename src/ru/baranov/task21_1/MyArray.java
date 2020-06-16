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
            int rowLength = myArray[i].length;
            int[] temp = new int[rowLength];
            for (int j = 0; j < rowLength; j++) {
                int newIndex = (j - 1 < 0) ? rowLength + j - 1 : j - 1;
                temp[newIndex] = myArray[i][j];
            }
            for (int j = 0; j < rowLength; j++) {
                myArray[i][j] = temp[j];
            }
        }
        myArray[0][myArray[0].length - 1] = 0;
        myArray[myArray.length - 1][myArray[0].length - 1] = 0;
    }
}

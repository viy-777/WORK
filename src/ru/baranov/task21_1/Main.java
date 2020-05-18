package ru.baranov.task21_1;

//Дан двумерный массив. Задача – написать метод
//
//public void toLeft() {}
//1.Пройти с 1-ой до последней строки
//2.Пройти с 1-го до предпоследнего элемента
//3.В текущую ячейку поместить значение следующей
//4.Последнему элементу присвоить 0

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyArray myArray = new MyArray();
        myArray.toLeft();
    }
}

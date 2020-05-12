package ru.baranov.task15;

//Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
//Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
//Дополнительное задание (необязательно): программа должна следить за глубиной рекурсии,
//сдвигая название файла/каталога на соответствующее количество пробелов.

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileControl fileCtrl = new FileControl();
        fileCtrl.createDirectory("task15");
        fileCtrl.createDirectory("task15\\folder1");
        fileCtrl.createDirectory("task15\\folder2");
        fileCtrl.createFile("", "task15\\folder1", "File.txt");
        fileCtrl.renameFile("task15\\folder1", "File.txt", "File2.txt");
        fileCtrl.copyFile("task15\\folder1", "task15\\folder2", "File2.txt",
                "File22.txt");
        fileCtrl.deleteFile("task15\\folder2", "File22.txt");

        fileCtrl.recurs("Temp");
    }
}

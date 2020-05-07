package ru.baranov.task18;

//Написать программу, которая копирует файл с одной кодировкой в файл с другой.

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CodeChange codeChange = new CodeChange();
        codeChange.createDirectory("task18");
        codeChange.createFile("Много текста. Много текста.", "task18", "Text1.txt");
        codeChange.createFile("", "task18", "Text2.txt");
        codeChange.codeCh("task18", "Text1.txt", "Text2.txt");
    }
}
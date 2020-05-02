package ru.baranov.task18;

//Написать программу, которая копирует файл с одной кодировкой в файл с другой.

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String text = new String("Много текста. Много текста.");

        File file1 = new File("C:\\task18\\Text1.txt");
        File file2 = new File("C:\\task18\\Text2.txt");

        //Создание текстового файла с кодировкой "UTF-8"
        try (FileOutputStream fop = new FileOutputStream(file1)) {

            if (!file1.exists()) {
                file1.createNewFile();
            } else {
                System.out.println("Файл 'Text1.txt' уже существует");
            }

            byte[] contentInBytes = text.getBytes("UTF-8");
            System.out.println("Текст в кодировке 'UTF-8' в файле 'Text1.txt': " + contentInBytes);

            fop.write(contentInBytes);
            fop.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Считывание данных из текстового файла "Text1.txt" с кодировкой "UTF-8" и запись
        // в текстовый файл "Text2.txt" с кодировкой "ISO-8859-1"
        try {
            FileInputStream fin = new FileInputStream(file1);
            FileOutputStream fop = new FileOutputStream(file2);

            byte[] buffer = new byte[fin.available()];
            fin.read(buffer);
            String stringBuffer = new String(buffer);

            if (!file2.exists()) {
                file2.createNewFile();
            } else {
                System.out.println("Файл 'Text2.txt' уже существует");
            }

            byte[] contentInBytes = stringBuffer.getBytes("ISO-8859-1");
            System.out.println("Текст в кодировке 'ISO-8859-1' в файле 'Text2.txt': " + contentInBytes);
            fop.write(contentInBytes);
            fop.flush();

        } catch (IOException e) {
            e.getMessage();
        }

        //Текстовый файл с кодировкой "ISO-8859-1"
        // File file2 = new File("C:\\task18\\Text2.txt");
      /*  try (FileOutputStream fop = new FileOutputStream(file2)) {

            if (!file2.exists()) {
                file2.createNewFile();
            } else {
                System.out.println("Файл 'Text2.txt' уже существует");
            }

            byte[] contentInBytes = buffer.getBytes("ISO-8859-1");
            System.out.println("Текст в кодировке 'ISO-8859-1' в файле 'Text2.txt': " + contentInBytes);

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
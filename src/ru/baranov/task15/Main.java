package ru.baranov.task15;

//Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
//Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
//Дополнительное задание (необязательно): программа должна следить за глубиной рекурсии,
//сдвигая название файла/каталога на соответствующее количество пробелов.

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {

    public static void main(String[] args) throws IOException {

        if (!Files.exists(Paths.get("C:\\task15"))) {
            Path directory0 = Files.createDirectory(Paths.get("C:\\task15"));
            System.out.println("Директория 'task15' успешно создана?");
            System.out.println(Files.exists(Paths.get("C:\\task15")));
        } else {
            System.out.println("Директория 'task15' уже создана.");
        }

        //создание файла
        if (!Files.exists(Paths.get("C:\\task15\\File.txt"))) {
            Path file0 = Files.createFile(Paths.get("C:\\task15\\File.txt"));
            System.out.println("Файл 'File.txt' успешно создан?");
            System.out.println(Files.exists(Paths.get("C:\\task15\\File.txt")));
        } else {
            System.out.println("Файл 'File.txt' уже создан.");
        }

        //переименование файла
        if (!Files.exists(Paths.get("C:\\task15\\File2.txt"))) {
            Path source = Paths.get("C:\\task15\\File.txt");
            Files.move(source, source.resolveSibling("File2.txt"));
            System.out.println("Файл 'File.txt' успешно переименован в 'File2.txt'?");
            System.out.println(Files.exists(Paths.get("C:\\task15\\File2.txt")));
        } else {
            System.out.println("Файл 'File.txt' уже переименован в 'File2.txt'.");
        }

        //копирование файла и создание нового
        if ((Files.exists(Paths.get("C:\\task15\\File2.txt"))) && (!Files.exists(Paths.get("C:\\task15\\File22.txt")))) {
            Files.copy(Paths.get("C:\\task15\\File2.txt"), Paths.get("C:\\task15\\File22.txt"), REPLACE_EXISTING);
            System.out.println("Файл 'File22.txt' успешно создан из 'File2.txt'?");
            System.out.println(Files.exists(Paths.get("C:\\task15\\File22.txt")));
        } else {
            System.out.println("Файл 'File22.txt' уже создан из файла  в 'File2.txt'.");
        }

        //удаление файла
        if (Files.exists(Paths.get("C:\\task15\\File22.txt"))) {
            Files.delete(Paths.get("C:\\task15\\File22.txt"));
            System.out.println("Файл 'File22.txt' успешно удален?");
            System.out.println(!Files.exists(Paths.get("C:\\task15\\File22.txt")));
        } else {
            System.out.println("Файл 'File22.txt' уже удален.");
        }

        //обход файлов в папке C:\task15
        File f = new File("C:\\task15");
        String SS[] = f.list();
        System.out.println("Содержимое папки 'C:\\task15': " + Arrays.toString(SS));
    }
}

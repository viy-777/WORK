package ru.baranov.task15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileControl {

    //создание директории
    public void createDirectory(String name) {
        Path path = Paths.get("Temp\\" + name);
        if (!Files.exists(path)) {
            try {
                Path directory0 = Files.createDirectory(path);
                System.out.println("Папка '" + name + "' успешно создана");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Папка '" + name + "' уже создана");
        }
    }

    //Создание текстового файла
    public void createFile(String text, String nameDir, String nameFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Temp\\" + nameDir + "\\" + nameFile))) {
            writer.write(text);
            System.out.println("Файл '" + nameFile + "' успешно создан в папке '" + nameDir + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //переименование файла
    public void renameFile(String nameDir, String nameFile1, String nameFile2) throws IOException {
        //переименование файла 'File.txt' в 'File2.txt'
        Path path = Paths.get("Temp\\" + nameDir);
        if (!Files.exists(Paths.get(path + "\\" + nameFile2))) {
            Path source = Paths.get(path + "\\" + nameFile1);
            Files.move(source, source.resolveSibling("File2.txt"));
            System.out.println("Файл '" + nameFile1 + "' успешно переименован в '" + nameFile2 + "'");
        } else {
            System.out.println("Файл '" + nameFile1 + "' уже переименован в '" + nameFile2 + "'");
        }
    }

    //копирование файла
    public void copyFile(String nameDir1, String nameDir2, String nameFile1, String nameFile2) throws IOException {
        Path path1 = Paths.get("Temp\\" + nameDir1 + "\\" + nameFile1);
        Path path2 = Paths.get("Temp\\" + nameDir2 + "\\" + nameFile2);
        if (Files.exists(path1) && !Files.exists(path2)) {
            Files.copy(path1, path2, REPLACE_EXISTING);
            System.out.println("Файл 'File22.txt' успешно создан из 'File2.txt'");
        } else {
            System.out.println("Файл 'File22.txt' уже создан из файла  в 'File2.txt'.");
        }
    }

    //удаление файла
    public void deleteFile(String nameDir, String nameFile) throws IOException {
        Path path = Paths.get("Temp\\" + nameDir);
        if (Files.exists(Paths.get(path + "\\File22.txt"))) {
            Files.delete(Paths.get(path + "\\File22.txt"));
            System.out.println("Файл '" + nameFile + "' успешно удален");
        } else {
            System.out.println("Файл '" + nameFile + "' уже удален");
        }
    }

    //Обзор объектов в директории
    public static void recurs(String dirName) {
        File dir = new File(dirName);
        System.out.println(dir.getName() + (!dir.isDirectory() ? "  файл" : ""));

        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null)
                for (File name : list)
                    recurs(name.getPath());
        }
    }

}

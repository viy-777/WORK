package ru.baranov.task18;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

public class CodeChange {

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
            System.out.println("Файл '" + nameFile + "' успешно создан");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    char[] buf = new char[2048];

    public void codeCh(String nameDir, String nameFile1, String nameFile2) {

        //Чтение текстового файла №1 и запись в файл №2 с другой кодировкой
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("Temp\\" + nameDir + "\\" + nameFile1), UTF_8));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Temp\\" + nameDir + "\\" + nameFile2), ISO_8859_1))) {
            while (reader.read(buf) != -1) writer.write(buf);
            System.out.println("Текст сохранен в другой кодировке");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

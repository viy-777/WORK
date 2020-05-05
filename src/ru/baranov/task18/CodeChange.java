package ru.baranov.task18;

import java.io.*;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

public class CodeChange {

    char[] buf = new char[2048];
    String text = "Много текста. Много текста.";
    String name1 = "Task18_text1.txt";
    String name2 = "Task18_text2.txt";

    public void createFile(String text, String name) {
        //Создание текстового файла
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void codeCh() {

        //Создание текстовых файлов
        CodeChange codeChange = new CodeChange();
        codeChange.createFile(text, name1);
        codeChange.createFile("", name2);

        //Чтение текстового файла №1 и запись в файл №2 с другой кодировкой
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(name1), UTF_8));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name2), ISO_8859_1))) {
            while (reader.read(buf) != -1) writer.write(buf);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

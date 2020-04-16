package ru.baranov.task11;

public class Main {
    public static void main(String[] args) {
        String s1 = "Я помню чудное мгновенье:\n" +
                "Передо мной явилась бяка,\n" +
                "Как мимолетное виденье,\n" +
                "Как бяка чистой красоты.";

        System.out.printf("Исходный текст: \n \n%s \n ", s1);
        System.out.println();

        String s2 = s1.replace("бяка", "вырезано цензурой");

        System.out.printf("Отредактированный текст: \n \n%s \n", s2);
    }
}

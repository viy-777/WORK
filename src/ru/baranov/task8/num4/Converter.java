package ru.baranov.task8.num4;

public class Converter {

    public static void converter(int number, String date, String[] contain) {
        Statement statement = new Statement();
        statement.number = number;
        statement.date = date;
        statement.contain = contain;

        System.out.println("----Акт----");
        System.out.printf("Номер: %d, Дата: %s, Товар №1: %s, Товар №2: %s, Товар №3: %s", statement.getNumber(),
                statement.getDate(), statement.getContain()[0], statement.getContain()[1], statement.getContain()[2]);
    }
}

package ru.baranov.task8.num4;

public class Statement {
    private static int number;
    private static String date;
    private static String contain[] = new String[3];

    public static void setNumber(int number) {
        Statement.number = number;
    }

    public static void setDate(String date) {
        Statement.date = date;
    }

    public static void setContain(String[] contain) {
        Statement.contain = contain;
    }

    public static int getNumber() {
        return number;
    }

    public static String getDate() {
        return date;
    }

    public static String[] getContain() {
        return contain;
    }
}

package ru.baranov.task8.num4;

import java.util.Scanner;

public class Contract {
    static int number = 0;
    static String date = "";
    static String[] contain = new String[3];

    public Contract() {
        number = number;
        date = date;
        contain = contain;
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

    public static void setNumber(int number) {
        Contract.number = number;
    }

    public static void setDate(String date) {
        Contract.date = date;
    }

    public static void setContain(String[] contain) {
        Contract.contain = contain;
    }

    public void c() {
        System.out.println("----Акт----");
        System.out.println("Номер:");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        System.out.println("Дата:");
        date = in.next();

        for (int i = 0; i < contain.length; i++) {
            System.out.println("№" + (i + 1));
            contain[i] = in.next();
        }
    }
}

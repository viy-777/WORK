package ru.baranov.task8.num4;

import java.util.Scanner;

public class Contract {
    private static int number;
    private static String date;
    private static String[] contain = new String[3];

    public static int getNumber() {
        return number;
    }

    public static String getDate() {
        return date;
    }

    public static String[] getContain() {
        return contain;
    }

    public void data() {
        System.out.println("----Договор----");
        System.out.println("Номер:");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        System.out.println("Дата:");
        date = in.next();

        for (int i = 0; i < contain.length; i++) {
            System.out.println("№" + (i + 1));
            contain[i] = in.next();
        }

        Converted.conv();
    }
}

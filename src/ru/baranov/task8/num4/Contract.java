package ru.baranov.task8.num4;

import java.util.Scanner;

public class Contract {
    private int number;
    private String date;
    private String[] contain = new String[3];

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String[] getContain() {
        return contain;
    }

    public void c() {
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
    }
}

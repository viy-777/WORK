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

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContain(String[] contain) {
        this.contain = contain;
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

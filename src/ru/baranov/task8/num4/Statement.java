package ru.baranov.task8.num4;

public class Statement {
    private int number;
    private String date;
    private String contain[] = new String[3];

    public Statement(int number, String date, String contain[]) {
        this.number = number;
        this.date = date;
        this.contain = contain;
    }

    public void st() {
        System.out.println();
        System.out.println("----Договор----");
        System.out.println("Номер: " + number);
        System.out.println("Дата: " + date);
        for (int i = 0; i < contain.length; i++) {
            System.out.println("Товар №" + (i + 1) + " : " + contain[i]);
        }
    }
}

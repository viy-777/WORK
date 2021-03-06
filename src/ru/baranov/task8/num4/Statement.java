package ru.baranov.task8.num4;

public class Statement {
    private final int number;
    private final String date;
    private String[] goods;

    public Statement(int number, String date, String[] goods) {
        this.number = number;
        this.date = date;
        this.goods = goods;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String[] getGoods() {
        return goods;
    }
}

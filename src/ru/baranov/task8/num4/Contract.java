package ru.baranov.task8.num4;

public class Contract {
    int number = 44;
    String date = "10.05.2020";
    private String[] contain = {"Книга", "Пылесос", "Принтер"};

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String[] getContain() {
        return contain;
    }
}

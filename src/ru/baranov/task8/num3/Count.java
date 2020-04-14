package ru.baranov.task8.num3;

public class Count {


    private static int numObjects = 0;

    {
    }

    public Count() {
        numObjects += 1;
    }

    public Count(int n) {
        this();
    }

    public Count(String s) {
        this();
    }

    public Count(int g, String d) {
        this();
    }

    public void Info() {
        System.out.println("Количество создаваемых объектов: " + numObjects);                                        //метод для получения информации о количестве
    }
}

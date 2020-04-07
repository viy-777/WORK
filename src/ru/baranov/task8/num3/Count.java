package ru.baranov.task8.num3;

public class Count {


    static int num_objects = 0;

    {
    }

    public Count() {
        num_objects += 1;
    }

    public Count(int n) {
        num_objects += 1;
    }

    public Count(String s) {
        num_objects += 1;
    }

    public Count(int g, String d) {
        num_objects += 1;
    }

    public void Info() {
        System.out.println("Количество создаваемых объектов: " + num_objects);                                        //метод для получения информации о количестве
    }
}

package ru.baranov.task9.num3;

abstract public class Man implements Runnable, Swimmable {
    private String name;
    private String nationality;

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public Man(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public void run() {
    }

    public void swim() {
    }
}


package ru.baranov.task6;

public class Specialty {
    String name;
    int mark;

    Specialty(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

}

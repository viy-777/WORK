package ru.baranov.task9.num3;

abstract public class Man implements Runnable, Swimmable {
    private String name;
    private String nationality;

    Man(String name, String nationality) {
        name = name;
        nationality = nationality;
    }

    public void running() {
        System.out.printf("Бегун с именем %s, национальность: %s \n", name, nationality);
    }

    public void chempRunning() {
        System.out.printf("Чемпион по бегу %s, национальность: %s \n", name, nationality);
    }

    public void swimming() {
        System.out.printf("Пловец с именем %s, национальность: %s \n", name, nationality);
    }

    public void chempSwimming() {
        System.out.printf("Чемпион по плаванию %s, национальность: %s \n", name, nationality);
    }

}


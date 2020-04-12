package ru.baranov.task9.num3;

abstract public class Man /*implements Runnable, Swimmable*/ {
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

    public abstract void Info();
    /*
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
    }*/

}


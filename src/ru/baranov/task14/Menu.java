package ru.baranov.task14;

//Добавить в программу "Вендинговый автомат" журналирование событий, при этом стоит указать
//различные уровни логирования, как информационного уровня, так и предупреждения и ошибки.
//Настроить сбор логов в файл.
//Фреймворк логирования - на ваш выбор.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Menu {

    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);

        try {
            FileHandler fh = new FileHandler("MyFile.log");
            fh.setLevel(Level.ALL);
            fh.setFormatter(new SimpleFormatter());
            logr.addHandler(fh);
        } catch (IOException e) {
            logr.log(Level.SEVERE, "File logger не работает", e);
        }

        int numUser = 0;
        double moneyUser = 0;

        Drinks[] d = Drinks.values();

        System.out.println("Меню:");
        for (Drinks drinks : Drinks.values()) {
            System.out.println("напиток №" + (drinks.ordinal() + 1) + ": " + drinks.name() +
                    " - " + drinks.price + " руб.");
        }

        Scanner in = new Scanner(System.in);
        System.out.println();

        while (numUser <= 0 || numUser > Drinks.values().length) {
            System.out.println("Выберите номер напитка:");
            numUser = in.nextInt();

            if (numUser <= 0 || numUser > Drinks.values().length) {
                logr.log(Level.SEVERE, "№" + numUser + " - неверный номер напитка!");
            } else {
                logr.log(Level.INFO, "Выбран напиток №" + numUser);
            }
        }

        int numberDrink = (numUser - 1);

        while ((moneyUser <= 0) || (moneyUser < d[numberDrink].price)) {
            System.out.println("Пополните счет:");
            moneyUser = in.nextDouble();

            if ((moneyUser <= 0) || (moneyUser < d[numberDrink].price)) {
                System.out.println("Недостаточно денежных средств!");
                logr.log(Level.WARNING, moneyUser + " руб. - недостаточно для приобретения напитка '" + d[numberDrink].name() + "' (" + d[numberDrink].price + " руб.)!'");
            } else {
                System.out.println("Получите напиток '" + d[numberDrink].name() + "'");
                logr.log(Level.INFO, "Выдан напиток '" + d[numberDrink].name() + "'");
            }
        }
    }
}

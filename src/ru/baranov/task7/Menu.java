package ru.baranov.task7;

//«Вендинговый автомат»

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        int numUser = 0;
        double moneyUser = 0;

        Drinks[] d = Drinks.values();

        System.out.println("Меню:");
        for (Drinks drinks : Drinks.values()) {
            System.out.println("напиток №" + (drinks.ordinal() + 1) + ": " + drinks.name() + " - " + drinks.price + " руб.");
        }

        Scanner in = new Scanner(System.in);
        System.out.println();

        while (numUser <= 0 || numUser > Drinks.values().length) {
            System.out.println("Выберите номер напитка:");
            numUser = in.nextInt();
        }

        while (moneyUser <= 0) {
            System.out.println("Пополните счет:");
            moneyUser = in.nextDouble();
        }

        if (d[numUser - 1].price > moneyUser) {
            System.out.println("Недостаточно денежных средств!");
        } else {
            System.out.println("Получите напиток " + d[numUser - 1].name());
        }
    }
}

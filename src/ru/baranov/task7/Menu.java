package ru.baranov.task7;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        int numUser = 0;
        double moneyUser = 0;

        System.out.println("Меню:");
        for (Drink number : Drink.values()) {
            System.out.println("напиток №" + number.number + ": " + number.name + " - " + number.price + " руб.");
        }

        System.out.println();
        System.out.println("Выберите номер напитка:");
        Scanner in = new Scanner(System.in);
        numUser = in.nextInt();

        System.out.println();
        System.out.println("Пополните счет:");
        moneyUser = in.nextDouble();

        if ((numUser > Drink.values().length) || (numUser <= 0)) {
            System.out.println("Введен несуществующий номер напитка!");
        }

        if (moneyUser == 0) {
            System.out.println("Отсутствуют денежные средства!");
        }

        switch (numUser) {
            case 1:
                if (Drink.DRINK1.price > moneyUser) {
                    System.out.println("Недостаточно денежных средств!");
                    break;
                }
                System.out.println("Получите напиток " + Drink.DRINK1.name);
                break;
            case 2:
                if (Drink.DRINK2.price > moneyUser) {
                    System.out.println("Недостаточно денежных средств!");
                    break;
                }
                System.out.println("Получите напиток " + Drink.DRINK2.name);
                break;
            case 3:
                if (Drink.DRINK3.price > moneyUser) {
                    System.out.println("Недостаточно денежных средств!");
                    break;
                }
                System.out.println("Получите напиток " + Drink.DRINK3.name);
                break;
            case 4:
                if (Drink.DRINK4.price > moneyUser) {
                    System.out.println("Недостаточно денежных средств!");
                    break;
                }
                System.out.println("Получите напиток " + Drink.DRINK4.name);
                break;
        }
    }
    }

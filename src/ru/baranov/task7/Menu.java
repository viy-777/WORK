package ru.baranov.task7;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        int num_user = 0;
        double money_user = 0;
        int num_max = Drink.values().length;                                                                             //максимальное количество напитков в автомате

        System.out.println("Меню:");                                                                                     //вывод на консоль меню автомата
        for (Drink number : Drink.values()) {
            System.out.println("напиток №" + number.number + ": " + number.name + " - " + number.price + " руб.");
        }

        System.out.println();
        System.out.println("Выберите номер напитка:");                                                                   //выбор пользователем номера напитка
        Scanner in = new Scanner(System.in);
        num_user = in.nextInt();

        System.out.println();
        System.out.println("Пополните счет:");                                                                           //пополнение пользователем счета
        money_user = in.nextDouble();

        while (true) {
            if ((num_user > num_max) || (num_user <= 0)) {                                                               //проверка на правильность ввода номера напитка
                System.out.println("Введен несуществующий номер напитка!");
                break;
            }

            if (money_user == 0) {                                                                                       //проверка на наличие денежных средств
                System.out.println("Отсутствуют денежные средства!");
                break;
            }

            switch (num_user) {
                case 1:
                    if (Drink.DRINK1.price > money_user) {                                                                       //проверка денежных средств
                        System.out.println("Недостаточно денежных средств!");
                        break;
                    }
                    System.out.println("Получите напиток " + Drink.DRINK1.name);
                    break;
                case 2:
                    if (Drink.DRINK2.price > money_user) {                                                                       //проверка денежных средств
                        System.out.println("Недостаточно денежных средств!");
                        break;
                    }
                    System.out.println("Получите напиток " + Drink.DRINK2.name);
                    break;
                case 3:
                    if (Drink.DRINK3.price > money_user) {                                                                       //проверка денежных средств
                        System.out.println("Недостаточно денежных средств!");
                        break;
                    }
                    System.out.println("Получите напиток " + Drink.DRINK3.name);
                    break;
                case 4:
                    if (Drink.DRINK4.price > money_user) {                                                                       //проверка денежных средств
                        System.out.println("Недостаточно денежных средств!");
                        break;
                    }
                    System.out.println("Получите напиток " + Drink.DRINK4.name);
                    break;
                default:
            }
            return;
        }
    }
}

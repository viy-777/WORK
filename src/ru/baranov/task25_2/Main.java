package ru.baranov.task25_2;

//Реализовать класс корзины интернет магазина по следующему интерфейсу, используя реализацию мапы:
//interface Basket {
//    void addProduct(String product, int quantity);
//    void removeProduct(String product);
//    void updateProductQuantity(String product, int quantity);
//    void clear();
//    List<String> getProducts();
//    int getProductQuantity(String product);}

import ru.baranov.task23.SimpleBasket;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String productToRemove = null;
        String productUpdate = null;
        String singleProductQuantity = null;
        String productName;
        int productQuantity;
        int quantityUpdate;
        String clearBasket;
        Scanner in = new Scanner(System.in);

        SimpleBasketMap simpleBasketMap = new SimpleBasketMap();

        simpleBasketMap.addProduct("Футболка", 3);
        simpleBasketMap.addProduct("Носки", 5);
        simpleBasketMap.addProduct("Бейсболка", 1);

        System.out.println("Товаров в корзине:");

        for (Object name : simpleBasketMap.getProducts()) {
            int num = simpleBasketMap.getProducts().indexOf(name);
            int quantity = simpleBasketMap.getQuantity().get(num);
            System.out.println("№" + (num + 1) + " " + name + ", " + quantity + " шт.");
        }

        System.out.print("Добавьте товар в корзину ('-' - для пропуска): ");
        productName = in.next();
        if (!productName.equals("-")) {
            System.out.print("Укажите количество товара: ");
            productQuantity = in.nextInt();
            simpleBasketMap.addProduct(productName, productQuantity);
        }

        System.out.println("Выберите товар для удаления из корзины ('-' - для пропуска):");
        productToRemove = in.next();
        if (!productToRemove.equals("-"))
            simpleBasketMap.removeProduct(productToRemove);

        System.out.println("Обновление кол-ва товара ('-' - для пропуска):");
        productUpdate = in.next();
        if (!productUpdate.equals("-")) {
            quantityUpdate = in.nextInt();
            simpleBasketMap.updateProductQuantity(productUpdate, quantityUpdate);
        }

        System.out.println("Получить кол-во товара ('-' - для пропуска):");
        singleProductQuantity = in.next();
        if (!singleProductQuantity.equals("-")) {
            int num = simpleBasketMap.getProductQuantity(singleProductQuantity);
            System.out.println("Кол-во товара (" + singleProductQuantity + ") в корзине: " + num + " шт.");
        }

        System.out.println("Очистить корзину (Да/Нет):");
        clearBasket = in.next();
        if (clearBasket.equals("Да")) {
            simpleBasketMap.clear();
            System.out.println("Товаров в корзине: -");
        } else {
            System.out.println("Товаров в корзине:");
            for (Object name : simpleBasketMap.getProducts()) {
                int num = simpleBasketMap.getProducts().indexOf(name);
                int quantity = simpleBasketMap.getQuantity().get(num);
                System.out.println("№" + (num + 1) + " " + name + ", " + quantity + " шт.");
            }
        }
    }
}

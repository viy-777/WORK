package ru.baranov.task23;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String productToRemove = null;
        String productUpdate = null;
        String singleProductQuantity = null;
        String productName;
        int productQuantity;
        int quantityUpdate;
        String clearBasket;
        Scanner in = new Scanner(System.in);

        SimpleBasket simpleBasket = new SimpleBasket();

        simpleBasket.addProduct("Футболка", 3);
        simpleBasket.addProduct("Носки", 5);
        simpleBasket.addProduct("Бейсболка", 1);

        System.out.println("Товаров в корзине:");
        for (Object name : simpleBasket.getProducts()) {
            int num = simpleBasket.getProducts().indexOf(name);
            int quantity = simpleBasket.getQuantity().get(num);
            System.out.println("№" + (num + 1) + " " + name + ", " + quantity + " шт.");
        }

        System.out.print("Добавьте товар в корзину ('-' - для пропуска): ");
        productName = in.next();
        if (!productName.equals("-")) {
            System.out.print("Укажите количество товара: ");
            productQuantity = in.nextInt();
            simpleBasket.addProduct(productName, productQuantity);
        }

        System.out.println("Выберите товар для удаления из корзины ('-' - для пропуска):");
        productToRemove = in.next();
        if (!productToRemove.equals("-"))
            simpleBasket.removeProduct(productToRemove);

        System.out.println("Обновление кол-ва товара ('-' - для пропуска):");
        productUpdate = in.next();
        if (!productUpdate.equals("-")) {
            quantityUpdate = in.nextInt();
            simpleBasket.updateProductQuantity(productUpdate, quantityUpdate);
        }

        System.out.println("Получить кол-во товара ('-' - для пропуска):");
        singleProductQuantity = in.next();
        if (!singleProductQuantity.equals("-")) {
            int num = simpleBasket.getProductQuantity(singleProductQuantity);
            System.out.println("Кол-во товара (" + singleProductQuantity + ") в корзине: " + num + "шт.");
        }

        System.out.println("Очистить корзину (Да/Нет):");
        clearBasket = in.next();
        if (clearBasket.equals("Да")) {
            simpleBasket.clear();
            System.out.println("Товаров в корзине: -");
        } else {
            System.out.println("Товаров в корзине:");
            for (Object name : simpleBasket.getProducts()) {
                int num = simpleBasket.getProducts().indexOf(name);
                int quantity = simpleBasket.getQuantity().get(num);
                System.out.println("№" + (num + 1) + " " + name + ", " + quantity + " шт.");
            }
        }
    }
}
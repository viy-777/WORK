package ru.baranov.task23;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String productToRemove = null;
        String productUpdate = null;
        String productQuantity = null;
        int quantityUpdate;
        String clearBasket;
        Scanner in = new Scanner(System.in);

        OnlineShop onlineShop = new OnlineShop();
        onlineShop.addProduct("Шорты", 2);
        onlineShop.addProduct("Носки", 5);
        onlineShop.addProduct("Бейсболка", 1);

        onlineShop.getProducts();

        System.out.println("Выберите товар для удаления из корзины ('-' - для пропуска):");
        productToRemove = in.next();
        if (!productToRemove.equals("-")) {
            onlineShop.removeProduct(productToRemove);
            onlineShop.getProducts();
        }

        System.out.println("Обновление кол-ва товара ('-' - для пропуска):");
        productUpdate = in.next();
        if (!productUpdate.equals("-")) {
            quantityUpdate = in.nextInt();
            onlineShop.updateProductQuantity(productUpdate, quantityUpdate);
            onlineShop.getProducts();
        }

        System.out.println("Получить кол-во товара ('-' - для пропуска):");
        productQuantity = in.next();
        if (!productQuantity.equals("-")) {
            onlineShop.getProductQuantity(productQuantity);
        }

        System.out.println("Очистить корзину (Да/Нет):");
        clearBasket = in.next();
        if (clearBasket.equals("Да")) {
            onlineShop.clear();
            onlineShop.getProducts();
        }
    }
}
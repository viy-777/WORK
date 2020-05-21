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

        BasketSimple basketSimple = new BasketSimple();

        basketSimple.addProduct("Футболка", 3);
        basketSimple.addProduct("Носки", 5);
        basketSimple.addProduct("Бейсболка", 1);
        basketSimple.getProducts();

        System.out.print("Добавьте товар в корзину: ");
        productName = in.next();
        System.out.print("Укажите количество товара: ");
        productQuantity = in.nextInt();
        basketSimple.addProduct(productName, productQuantity);
        basketSimple.getProducts();

        System.out.println("Выберите товар для удаления из корзины ('-' - для пропуска):");
        productToRemove = in.next();
        if (!productToRemove.equals("-")) {
            basketSimple.removeProduct(productToRemove);
            basketSimple.getProducts();
        }

        System.out.println("Обновление кол-ва товара ('-' - для пропуска):");
        productUpdate = in.next();
        if (!productUpdate.equals("-")) {
            quantityUpdate = in.nextInt();
            basketSimple.updateProductQuantity(productUpdate, quantityUpdate);
            basketSimple.getProducts();
        }

        System.out.println("Получить кол-во товара ('-' - для пропуска):");
        singleProductQuantity = in.next();
        if (!singleProductQuantity.equals("-")) {
            basketSimple.getProductQuantity(singleProductQuantity);
        }

        System.out.println("Очистить корзину (Да/Нет):");
        clearBasket = in.next();
        if (clearBasket.equals("Да")) {
            basketSimple.clear();
            basketSimple.getProducts();
        }
    }
}
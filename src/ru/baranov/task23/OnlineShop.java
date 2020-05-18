package ru.baranov.task23;

import java.util.*;

public class OnlineShop implements Basket {
    String product;
    int quantity;

    ArrayList<String> listProduct = new ArrayList<String>();
    ArrayList<Integer> listQuantity = new ArrayList<Integer>();

    @Override
    public void addProduct(String product, int quantity) {
        listProduct.add(product);
        listQuantity.add(quantity);

    }

    @Override
    public void removeProduct(String product) {
        int num = listProduct.indexOf(product);
        listQuantity.remove(num);
        listProduct.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int num = listProduct.indexOf(product);
        listQuantity.set(num, quantity);
    }

    @Override
    public void clear() {
        listProduct.clear();
        listQuantity.clear();
    }

    @Override
    public void getProducts() {
        System.out.println("Товаров в корзине (кол-во позиций" + listProduct.size() + "):");
        for (Object o : listProduct) {
            int num = listProduct.indexOf(o);
            System.out.println("№" + (num + 1) + ": " + o.toString() + ", кол-во: " + listQuantity.get(num));
        }
        System.out.println();
    }

    @Override
    public void getProductQuantity(String product) {
        int num = listProduct.indexOf(product);
        System.out.println("Кол-во товара (" + product + ") в корзине:" + listQuantity.get(num));
    }
}

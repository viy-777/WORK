package ru.baranov.task23;

import java.util.ArrayList;
import java.util.List;

public class BasketSimple implements Basket {

    private ArrayList<String> listProduct = new ArrayList();
    private ArrayList<Integer> listQuantity = new ArrayList();

    @Override
    public void addProduct(String product, int quantity) {
        int index = 0;
        if (listProduct.size() == 0) {
            listProduct.add(product);
            listQuantity.add(quantity);
        } else {
            for (int i = 0; i < listProduct.size(); i++) {
                if (product.equals(listProduct.get(i))) {
                    index = i;
                    break;
                }
            }
            if (index > 0) {
                listQuantity.set(index, (listQuantity.get(index) + quantity));
                index = 0;
            } else {
                listProduct.add(product);
                listQuantity.add(quantity);
            }
        }

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
    public List<String> getProducts() {
        System.out.println("Товаров в корзине (кол-во позиций " + listProduct.size() + "):");
        for (Object o : listProduct) {
            int num = listProduct.indexOf(o);
            System.out.println("№" + (num + 1) + ": " + o.toString() + ", кол-во: " + listQuantity.get(num));
        }
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        int num = listProduct.indexOf(product);
        System.out.println("Кол-во товара (" + product + ") в корзине:" + listQuantity.get(num));
        return 0;
    }
}

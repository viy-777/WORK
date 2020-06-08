package ru.baranov.task23;

import java.util.*;

public class SimpleBasket implements Basket {

    private List<String> listProduct = new ArrayList<>();
    private List<Integer> listQuantity = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        int index = listProduct.indexOf(product);
        if (index == -1) {
            listProduct.add(product);
            listQuantity.add(quantity);
        } else
            listQuantity.set(index, (listQuantity.get(index) + quantity));
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
        return listProduct;
    }

    public List<Integer> getQuantity() {
        return listQuantity;
    }

    @Override
    public int getProductQuantity(String product) {
        return (new ArrayList<>(listQuantity)).get((new ArrayList<String>(listProduct)).indexOf(product));
    }
}

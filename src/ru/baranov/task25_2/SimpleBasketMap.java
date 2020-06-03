package ru.baranov.task25_2;

import ru.baranov.task23.Basket;

import java.util.*;

public class SimpleBasketMap implements Basket {

    Map<String, Integer> basket = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (!basket.containsKey(product)) {
            basket.put(product, quantity);
        } else
            basket.replace(product, (basket.get(product) + quantity));
    }

    @Override
    public void removeProduct(String product) {
        basket.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        basket.replace(product, quantity);
    }

    @Override
    public void clear() {
        basket.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList(basket.keySet());
    }

    public List<Integer> getQuantity() {
        return new ArrayList(basket.values());
    }

    @Override
    public int getProductQuantity(String product) {
        return basket.get(product);
    }
}

package ru.baranov.task23;

public interface Basket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    void getProducts();

    void getProductQuantity(String product);
}

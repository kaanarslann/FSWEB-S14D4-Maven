package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = { new Chocolate("Bar", 10, "Milka")
                , new Coke("1 Litre", 8, "Coca-Cola")
                , new Bread("Sliced", 3, "UNO")};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i = 0; i < products.length; i++) {
            products[i].showDetails();
        }
    }
}
package org.example.model;

public class Coke extends ProductForSale{

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + super.getType() + ". Price: " + super.getPrice() + ". Description: " + super.getDescription());
    }
}

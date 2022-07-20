package ex.product.model;


import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private double Price;
    private int amount;

    public Product() {
    }

    public Product(int id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        Price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }




}


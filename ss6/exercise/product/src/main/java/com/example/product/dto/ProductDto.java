package com.example.product.dto;

import com.sun.istack.NotNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class ProductDto {
    private int id;

    @NotNull()
    @Pattern(regexp = "^[a-zA-Z]{5,45}$",message = "sai")
    private String name;

    @NotNull
    @Min(value = 1,message = "sai")
    private double Price;

    @NotNull
    @Min(value = 1)
    private int amount;

    public ProductDto() {
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

    public ProductDto(int id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        Price = price;
        this.amount = amount;
    }

}

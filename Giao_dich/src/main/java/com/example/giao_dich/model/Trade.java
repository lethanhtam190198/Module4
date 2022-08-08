package com.example.giao_dich.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTrade;

    private String codeTrade;

    @ManyToOne
    @JoinColumn(name = "code", referencedColumnName ="id")
    private Customer codeCustomer;

    private String dayTrade;
    private String tradeType;
    private double price;
    private double area;
    public Trade() {
    }

    public Trade(int idTrade, String codeTrade, Customer codeCustomer, String dayTrade, String tradeType, double price, double area) {
        this.idTrade = idTrade;
        this.codeTrade = codeTrade;
        this.codeCustomer = codeCustomer;
        this.dayTrade = dayTrade;
        this.tradeType = tradeType;
        this.price = price;
        this.area = area;
    }

    public int getIdTrade() {
        return idTrade;
    }

    public void setIdTrade(int idTrade) {
        this.idTrade = idTrade;
    }

    public String getCodeTrade() {
        return codeTrade;
    }

    public void setCodeTrade(String codeTrade) {
        this.codeTrade = codeTrade;
    }

    public Customer getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(Customer codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getDayTrade() {
        return dayTrade;
    }

    public void setDayTrade(String dayTrade) {
        this.dayTrade = dayTrade;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}

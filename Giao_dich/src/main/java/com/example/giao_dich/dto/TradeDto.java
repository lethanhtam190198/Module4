package com.example.giao_dich.dto;

import com.example.giao_dich.model.Customer;
import org.apache.el.util.Validation;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;


public class TradeDto {
    private int idTrade;

    @Pattern(regexp = "^[MGD]{1}-[0-9]{4}$", message = "Wrong format")
    private String codeTrade;
    private Customer codeCustomer;
    private String dayTrade;
    private String tradeType;
    @Min(value = 1, message = "So phai lon hon 1")
    private double price;
    @Min(value = 1, message = "So phai lon hon 1")
    private double area;

    public TradeDto() {
    }

    public TradeDto(int idTrade, String codeTrade, Customer codeCustomer, String dayTrade, String tradeType, double price, double area) {
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

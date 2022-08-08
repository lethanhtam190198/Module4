package com.example.giao_dich.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "codeCustomer", cascade = CascadeType.ALL)
    private Set<Trade> code;

    private String name;
    private String phoneNumber;
    private String email;

    public Customer() {
    }

    public Customer(int id, Set<Trade> code, String name, String phoneNumber, String email) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Trade> getCode() {
        return code;
    }

    public void setCode(Set<Trade> code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

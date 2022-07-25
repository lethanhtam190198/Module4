package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private String userName;
    private String password;

    @OneToMany(mappedBy = "userName", cascade = CascadeType.ALL)
    private Set<Employee> employees;

    @ManyToMany(mappedBy = "users")
    private Set<Role> roles;

    public User() {
    }

    public User(String userName, String password, Set<Employee> employees, Set<Role> roles) {
        this.userName = userName;
        this.password = password;
        this.employees = employees;
        this.roles = roles;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

package com.example.register.dto;

import com.sun.istack.NotNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class UserDto  {

    private int id;
    @NotNull()
    @Pattern(regexp = "^[a-zA-Z]{5,45}$",message = "sai")
    private String firstName;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z]{5,45}$",message = "sai")
    private String lastName;

    @Min(value = 18)
    private int age;

    @NotNull
    @Valid
    @Pattern(regexp = "^[0-9]{9}$",message = "Input 9 numbers")
    private String phoneNumber;

    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",message = "abc@gmail.com")
    private String email;

    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, int age, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

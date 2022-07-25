package com.example.casestudy.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;

    private String employeeName;

    private String employeeDayOfBirth;

    private String employeeIdCard;

    private double employeeSalary;

    private String employeePhoneNumber;

    private String employeeEmail;

    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "positionId",referencedColumnName = "positionId")
    private Position position;

    @ManyToOne
    @JoinColumn(name="educationDegreeId", referencedColumnName = "educationDegreeId")
    private  EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name="divisionId",referencedColumnName = "divisionId")
    private Division division;

    @ManyToOne
    @JoinColumn(name="userName",referencedColumnName = "userName")
    private User userName;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeDayOfBirth, String employeeIdCard, double employeeSalary, String employeePhoneNumber, String employeeEmail, String employeeAddress, Position position, EducationDegree educationDegree, Division division, User userName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDayOfBirth = employeeDayOfBirth;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.userName = userName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDayOfBirth() {
        return employeeDayOfBirth;
    }

    public void setEmployeeDayOfBirth(String employeeDayOfBirth) {
        this.employeeDayOfBirth = employeeDayOfBirth;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }
}

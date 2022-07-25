package com.example.casestudy.model;

import javax.persistence.*;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facilityId;
    private String facilityName;
    private int are;
    private int cost;
    private int maxPeople;

    @ManyToOne
    @JoinColumn(name = "rentTypeId",referencedColumnName ="rentTypeId")
    private RentType rentTypeId;

    @ManyToOne
    @JoinColumn(name="facilityTypeId",referencedColumnName = "facilityTypeId")
    private FacilityType facilityTypeId;

    private String standardRoom;
    private String descriptionOtherConvenience;
    private double poolArea;
    private int numberOffloors;
    private String facalityFree;

    public Facility() {
    }

    public Facility(int facilityId, String facilityName, int are, int cost, int maxPeople, RentType rentTypeId, FacilityType facilityTypeId, String standardRoom, String descriptionOtherConvenience, double poolArea, int numberOffloors, String facalityFree) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.are = are;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeId = rentTypeId;
        this.facilityTypeId = facilityTypeId;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOffloors = numberOffloors;
        this.facalityFree = facalityFree;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        this.are = are;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(RentType rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public FacilityType getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(FacilityType facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOffloors() {
        return numberOffloors;
    }

    public void setNumberOffloors(int numberOffloors) {
        this.numberOffloors = numberOffloors;
    }

    public String getFacalityFree() {
        return facalityFree;
    }

    public void setFacalityFree(String facalityFree) {
        this.facalityFree = facalityFree;
    }
}

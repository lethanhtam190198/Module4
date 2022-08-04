package com.example.casestudy.dto;

import com.example.casestudy.model.facility.FacilityType;
import com.example.casestudy.model.facility.RentType;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;


public class FacilityDto {
    private int facilityId;

    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Wrong format")
    private String facilityName;

    @Min(value = 1,message = "Minimum value is 1")
    private int are;

    @Min(value = 1,message = "Minimum value is 0")
    private int cost;

    @Min(value = 1,message = "Minimum value is 1")
    private int maxPeople;

    private RentType rentTypeId;

    private FacilityType facilityTypeId;

    private String standardRoom;

    private String descriptionOtherConvenience;

    private double poolArea;

    @Min(value = 1,message = "Minimum value is 1")
    private int numberOffloors;
    private String facilityFree;

    public FacilityDto() {
    }

    public FacilityDto(int facilityId, String facilityName, int are, int cost, int maxPeople, RentType rentTypeId, FacilityType facilityTypeId, String standardRoom, String descriptionOtherConvenience, double poolArea, int numberOffloors, String facilityFree) {
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
        this.facilityFree = facilityFree;
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

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}

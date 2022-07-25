package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentTypeId;
    private String rentTypeName;
    @OneToMany(mappedBy = "rentTypeId", cascade = CascadeType.ALL)
    private Set<Facility> facility;

    public RentType() {
    }

    public RentType(int rentTypeId, String rentTypeName, Set<Facility> facility) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.facility = facility;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public Set<Facility> getFacility() {
        return facility;
    }

    public void setFacility(Set<Facility> facility) {
        this.facility = facility;
    }
}

package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facilityTypeId;
    private String facilityTypeName;

    @OneToMany(mappedBy = "facilityTypeId",cascade = CascadeType.ALL)
    private Set<Facility>facilitis;

    public FacilityType() {
    }

    public FacilityType(int facilityTypeId, String facilityTypeName, Set<Facility> facilitis) {
        this.facilityTypeId = facilityTypeId;
        this.facilityTypeName = facilityTypeName;
        this.facilitis = facilitis;
    }

    public int getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(int facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getFacilityTypeName() {
        return facilityTypeName;
    }

    public void setFacilityTypeName(String facilityTypeName) {
        this.facilityTypeName = facilityTypeName;
    }

    public Set<Facility> getFacilitis() {
        return facilitis;
    }

    public void setFacilitis(Set<Facility> facilitis) {
        this.facilitis = facilitis;
    }
}

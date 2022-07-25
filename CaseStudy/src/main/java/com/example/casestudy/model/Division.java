package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int divisionId;
    private String divisionName;

    @OneToMany(mappedBy = "divisionId", cascade = CascadeType.ALL)
    private Set<Division> divisions;

    public Division() {
    }

    public Division(int divisionId, String divisionName, Set<Division> divisions) {
        this.divisionId = divisionId;
        this.divisionName = divisionName;
        this.divisions = divisions;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Set<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(Set<Division> divisions) {
        this.divisions = divisions;
    }
}

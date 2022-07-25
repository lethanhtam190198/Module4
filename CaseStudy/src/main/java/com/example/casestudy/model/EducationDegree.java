package com.example.casestudy.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int educationDegreeId;
    private String educationDegreeName;

    @OneToMany(mappedBy = "educationDegreeId", cascade = CascadeType.ALL)
    private Set<EducationDegree> educationDegrees;

    public EducationDegree() {
    }

    public EducationDegree(int educationDegreeId, String educationDegreeName, Set<EducationDegree> educationDegrees) {
        this.educationDegreeId = educationDegreeId;
        this.educationDegreeName = educationDegreeName;
        this.educationDegrees = educationDegrees;
    }

    public int getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(int educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

    public Set<EducationDegree> getEducationDegrees() {
        return educationDegrees;
    }

    public void setEducationDegrees(Set<EducationDegree> educationDegrees) {
        this.educationDegrees = educationDegrees;
    }
}

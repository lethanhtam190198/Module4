package com.example.casestudy.repository.employee;

import com.example.casestudy.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationDegreeRepository extends JpaRepository<EducationDegree,Integer> {
}

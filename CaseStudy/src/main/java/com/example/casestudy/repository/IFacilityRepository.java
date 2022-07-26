package com.example.casestudy.repository;

import com.example.casestudy.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
}

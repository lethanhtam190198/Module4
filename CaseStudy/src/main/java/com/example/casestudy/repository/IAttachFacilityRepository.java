package com.example.casestudy.repository;

import com.example.casestudy.model.AttachFacility;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IAttachFacilityRepository extends JpaRepository<AttachFacility, Integer> {
}

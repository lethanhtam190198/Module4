package com.example.casestudy.repository.facility;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.facility.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IFacilityRepository extends JpaRepository<Facility,Integer> {


    @Query(value = "select * from facility where  facility_name like :name ",nativeQuery = true)
    List<Facility> searchByName(@Param("name")String name);
}

package com.example.casestudy.service.facility;

import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.facility.Facility;

import java.util.List;

public interface IFacilityService {
    List<Facility> findAll();

    void save(Facility facility);

    void remove(int id);

    void updateFacility(Facility facility);

    Facility findById(int id);

    List<Facility> searchByName(String name);
}

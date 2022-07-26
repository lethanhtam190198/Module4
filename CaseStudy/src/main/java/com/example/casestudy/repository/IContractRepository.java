package com.example.casestudy.repository;

import com.example.casestudy.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractRepository extends JpaRepository<Contract,Integer> {
}

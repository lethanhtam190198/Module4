package com.example.casestudy.repository;

import com.example.casestudy.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position,Integer> {
}
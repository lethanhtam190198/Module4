package com.example.casestudy.service.employee;

import com.example.casestudy.model.employee.Position;
import com.example.casestudy.repository.employee.IPositionRepository;
import com.example.casestudy.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {

    @Autowired
    private IPositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}

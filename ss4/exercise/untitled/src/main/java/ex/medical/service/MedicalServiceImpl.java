package ex.medical.service;

import ex.medical.model.Medical;
import ex.medical.repository.IMedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalServiceImpl implements IMedicalService {
    @Autowired
    private IMedicalRepository medicalRepository;

    @Override
    public List<Medical> findAll() {
        return medicalRepository.findAll();
    }

    @Override
    public void create(Medical medical) {
        medicalRepository.create(medical);
    }

    @Override
    public Medical findId(int id) {
        return medicalRepository.findId(id);
    }


    @Override
    public void update(Medical medical) {
        medicalRepository.update(medical);
    }

    @Override
    public String[] getBirthYear() {
        return medicalRepository.getBirthYear();
    }

    @Override
    public String[] getTravellnformation() {
        return medicalRepository.getTravellnformation();
    }

    @Override
    public String[] getDepatureDay() {
        return medicalRepository.getDepatureDay();
    }

    @Override
    public String[] getEndDay() {
        return medicalRepository.getEndDay();
    }

}

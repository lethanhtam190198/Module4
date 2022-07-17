package ex.medical.service;

import ex.medical.models.Medical;
import ex.medical.repository.IMedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalServiceImpl implements IMedicalService {

    @Autowired
    private IMedicalRepository medicalRepository;

    @Override
    public List<Medical> getAll() {
        return medicalRepository.getAll();
    }

    @Override
    public void create(Medical info) {
        medicalRepository.create(info);
    }

    @Override
    public Medical findId(String id) {
        return medicalRepository.findId(id);
    }

    @Override
    public void update(Medical info) {
        medicalRepository.update(info);
    }

    @Override
    public String[] getBirthYear() {
        return medicalRepository.getBirthYear();
    }

    @Override
    public String[] getGender() {
        return medicalRepository.getGender();
    }

    @Override
    public String[] getNational() {
        return medicalRepository.getNational();
    }

    @Override
    public String[] getTransportType() {
        return medicalRepository.getTransportType();
    }

    @Override
    public String[] getInputDay() {
        return medicalRepository.getInputDay();
    }

    @Override
    public String[] getInputMonth() {
        return medicalRepository.getInputMonth();
    }

    @Override
    public String[] getInputYear() {
        return medicalRepository.getInputYear();
    }

    @Override
    public String[] getOutDay() {
        return medicalRepository.getOutDay();
    }

    @Override
    public String[] getOutMonth() {
        return medicalRepository.getOutMonth();
    }

    @Override
    public String[] getOutYear() {
        return medicalRepository.getOutYear();
    }
}

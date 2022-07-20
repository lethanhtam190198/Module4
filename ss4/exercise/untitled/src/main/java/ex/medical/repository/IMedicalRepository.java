package ex.medical.repository;

import ex.medical.model.Medical;

import java.util.List;

public interface IMedicalRepository {

    List<Medical> findAll();

    void create(Medical medical);

    Medical findId(int id);

    void update(Medical medical);

    String[] getBirthYear();

    String[] getTravellnformation();

    String[] getDepatureDay();

    String[] getEndDay();

}

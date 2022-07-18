package ex.medical.repository;

import ex.medical.models.Medical;

import java.util.List;

public interface IMedicalRepository {
    List<Medical> getAll();

    void create(Medical info);

    Medical findId(String id);

    void update(Medical info);

    String[] getBirthYear();

    String[] getGender();

    String[] getNational();

    String[] getTransportType();

    String[] getInputDay();

    String[] getInputMonth();

    String[] getInputYear();

    String[] getOutDay();

    String[] getOutMonth();

    String[] getOutYear();
}

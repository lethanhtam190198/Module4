package ex.medical.repository;

import ex.medical.models.Medical;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepositoryImpl implements IMedicalRepository {

    static List<Medical> medicalList = new ArrayList<>();

    String[] year = new String[]{"1998", "1999", "2000", "2001"};

    String[] gender = new String[]{"Male", "Female", "Other"};

    String[] nationality = new String[]{"Viet Nam", "Cambodia", "Singapore", "Laos"};

    String[] transportType = new String[]{"Phone", "Car", "Boat", "Other"};

    String[] inputDay = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "30"};

    String[] outDay = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "30"};

    String[] inputMonth = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",};

    String[] outMonth = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

    String[] inputYear = new String[]{"2019", "2020", "2021", "2022", "2023"};

    String[] outYear = new String[]{"2019", "2020", "2021", "2022", "2023"};

    static {
        medicalList.add(new Medical("1", "Tam TAm", "1998", "Male", "Laos", "123456789", "Boat", "68413", "1", "1", "1", "2022", "1", "1", "2022", "Qn"));
        medicalList.add(new Medical("2", "Hung", "2002", "Female", "Cambodia", "34343434", "Other", "123123", "2", "2", "2", "2022", "2", "2", "2023", "dn"));
    }


    @Override
    public List<Medical> getAll() {
        return medicalList;
    }

    @Override
    public void create(Medical info) {
        medicalList.add(info);
    }

    @Override
    public Medical findId(String id) {
        for (Medical info : medicalList) {
            if (id.equals(info.getId())) {
                return info;
            }
        }
        return null;
    }


    @Override
    public void update(Medical info) {
        for (Medical item : medicalList) {
            if (info.getId().equals(item.getId())) {

                item.setName(info.getName());
                item.setBirthYear(info.getBirthYear());
                item.setGender(info.getGender());
                item.setNational(info.getNational());
                item.setIdCard(info.getIdCard());
                item.setTransportType(info.getTransportType());
                item.setTransportId(info.getTransportId());
                item.setSeat(info.getSeat());
                item.setInputDay(info.getInputDay());
                item.setInputMonth(info.getInputMonth());
                item.setInputYear(info.getInputYear());
                item.setOutDay(info.getOutDay());
                item.setOutMonth(info.getOutMonth());
                item.setOutYear(info.getOutYear());
                item.setOther(info.getOther());
            }
        }
    }

    @Override
    public String[] getBirthYear() {
        return year;
    }

    @Override
    public String[] getGender() {
        return gender;
    }

    @Override
    public String[] getNational() {
        return nationality;
    }

    @Override
    public String[] getTransportType() {
        return transportType;
    }


    @Override
    public String[] getInputDay() {
        return inputDay;
    }

    @Override
    public String[] getInputMonth() {
        return inputMonth;
    }

    @Override
    public String[] getInputYear() {
        return inputYear;
    }

    @Override
    public String[] getOutDay() {
        return outDay;
    }

    @Override
    public String[] getOutMonth() {
        return outMonth;
    }

    @Override
    public String[] getOutYear() {
        return outYear;
    }
}

package ex.medical.repository;

import ex.medical.model.Medical;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicalRepositoryImpl implements IMedicalRepository{

    private static List<Medical> medicalList = new ArrayList<>();

    String [] birthDay = new String[]{"1990","1991","1992","1993","1994"};
    String [] travellnformation = new String[]{"tau bay","tau thuyen","o to","khac"};
    String [] depatureDay=  new String[]{"1","2","3","4","5","6"};
    String [] endDay=  new String[]{"1","2","3","4","5","6"};

    static {
        medicalList.add(new Medical(1,"Tam",1998,"tau bay",1,2,"aaaa"));
        medicalList.add(new Medical(2,"hung",2000,"tau thuyen",3,4,"bbbbb"));
    }

    @Override
    public List<Medical> findAll() {
        return medicalList;
    }

    @Override
    public void create(Medical medical) {
        medicalList.add(medical);
    }

    @Override
    public Medical findId(int id) {
        for (Medical info : medicalList) {
            if (info.getId() == id) {
                return info;
            }
        }
        return null;
    }


    @Override
    public void update(Medical medical) {
        medicalList.add(medical);
    }

    @Override
    public String[] getBirthYear() {
        return birthDay;
    }

    @Override
    public String[] getTravellnformation() {
        return travellnformation;
    }

    @Override
    public String[] getDepatureDay() {
        return depatureDay;
    }

    @Override
    public String[] getEndDay() {
        return endDay;
    }
}

package exercise.sandwich.service;


import org.springframework.stereotype.Service;

@Service
public class SanwichServiceImpl implements ISandwichService {
    @Override
    public String sandwich(String[] condiment) {
        String sandwich = "";
        for (String item : condiment) {
            sandwich += item + " ";
        }
        return sandwich;
    }
}

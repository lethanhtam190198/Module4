package ex.translate.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DistionaryRepositoryImpl implements IDistionaryRepository {

    public static Map<String, String> dictionaries = new HashMap<>();

    static {
        dictionaries.put("hello", "xin chao");
        dictionaries.put("dog", "con cho");
        dictionaries.put("cat", "con meo");
        dictionaries.put("goodbye", "tam biet");
        dictionaries.put("rat", "con chuot");
    }

    @Override
    public String translate(String search) {
        if (dictionaries.get(search) != null) {
            return dictionaries.get(search);
        } else {
            return "Khong tim thay";
        }
    }
}

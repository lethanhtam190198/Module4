package baitap.tudien.service.impl;


import baitap.tudien.repository.IDistionaryRepository;
import baitap.tudien.service.IDistionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DistionaryService implements IDistionaryService {

    @Autowired

    public IDistionaryRepository distionaryRepository;


    @Override
    public String translate(String search) {
        return distionaryRepository.translate(search);
    }
}

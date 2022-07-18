package ex.translate.service.impl;


import ex.translate.repository.IDistionaryRepository;
import ex.translate.service.IDistionaryService;
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

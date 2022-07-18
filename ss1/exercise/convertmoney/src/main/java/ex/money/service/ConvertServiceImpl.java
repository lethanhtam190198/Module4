package ex.money.service;

import org.springframework.stereotype.Service;

@Service
public class ConvertServiceImpl implements IConvertService {

    @Override
    public double convert(double usd) {
        return usd * 23000;
    }
}

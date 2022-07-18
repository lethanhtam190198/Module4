package exercise.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements ICurrencyService {
    @Override
    public double money(double usd) {

        return usd * 23000;
    }
}

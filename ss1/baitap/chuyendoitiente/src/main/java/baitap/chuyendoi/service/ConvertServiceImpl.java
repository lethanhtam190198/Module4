package baitap.chuyendoi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertServiceImpl implements IConvertService {

    @Override
    public double convert(double usd) {
        return usd * 23000;
    }
}

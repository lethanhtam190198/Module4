package com.example.giao_dich.service;

import com.example.giao_dich.model.Trade;
import com.example.giao_dich.repository.ITradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TradeService implements ITradeService{

    @Autowired
    private ITradeRepository tradeRepository;

    @Override
    public List<Trade> findAll() {
        return tradeRepository.findAll();
    }

    @Override
    public void save(Trade trade) {
        tradeRepository.save(trade);
    }

    @Override
    public List<Trade> search(String name, String tradeType) {
        return null;
    }

    @Override
    public void remove(int id) {
        tradeRepository.deleteById(id);
    }
}

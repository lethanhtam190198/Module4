package com.example.giao_dich.service;

import com.example.giao_dich.model.Trade;

import java.util.List;

public interface ITradeService {
    List<Trade> findAll();

    void save(Trade trade);

    List<Trade> search(String name, String tradeType);

    void remove(int id);
}

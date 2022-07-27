package com.example.aaaaa.service;

import com.example.aaaaa.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
}

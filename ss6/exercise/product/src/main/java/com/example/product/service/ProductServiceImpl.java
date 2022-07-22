package com.example.product.service;


import com.example.product.model.Product;
import com.example.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository productRepository;


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product.getPrice(),product.getAmount(),product.getName(),product.getId());
    }

    @Override
    public void remove(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return null;
//        return productRepository.findByName("%"+name+"%");
    }
}

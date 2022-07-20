package ex.product.service;

import ex.product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(int id);

    List<Product> findByName(String name);

    void remove(int id);
}

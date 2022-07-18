package ex.product.repository;

import ex.product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getData();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

    List<Product> findByName(String name);
}

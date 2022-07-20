package ex.product.repository;

import ex.product.model.Product;
import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    Product findById(int id);

    List<Product> findByName(String name);

    void remove(int id);
}

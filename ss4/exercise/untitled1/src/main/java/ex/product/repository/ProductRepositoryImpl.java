package ex.product.repository;

import ex.product.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository{
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Ip", 20000, 10));
        productList.add(new Product(2, "Samsung", 20000, 10));
        productList.add(new Product(3, "Xiaomi", 20000, 10));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(int id) {
        for (Product item : productList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList1 = new ArrayList<>();
        for (Product item : productList) {
            if (item.getName().contains(name)) {
                productList1.add(item);
            }
        }
        return productList1;
    }

    @Override
    public void remove(int id) {
        for (int i=0 ;i<productList.size();i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
            }
        }
    }
}

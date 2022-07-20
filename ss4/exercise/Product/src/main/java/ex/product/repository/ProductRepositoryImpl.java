package ex.product.repository;

import ex.product.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {

    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Ip", 20000, 10));
        productList.add(new Product(2, "Samsung", 20000, 10));
        productList.add(new Product(3, "Xiaomi", 20000, 10));
    }

    @Override
    public List<Product> getData() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        for (Product item : productList) {
            if (item.getId() == id) {
                product = item;
            }
        }
        return product;
    }

    @Override
    public void update(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.get(i).setId(product.getId());
                productList.get(i).setName(product.getName());
                productList.get(i).setPrice(product.getPrice());
                productList.get(i).setAmount(product.getAmount());
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
            }
        }
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
}

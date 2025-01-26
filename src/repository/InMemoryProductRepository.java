package repository;

import Utils.MyArrayList;
import Utils.MyList;
import model.Product;

import java.util.List;

public class InMemoryProductRepository implements ProductRepository {
    private final MyList<Product> products = new MyArrayList<>();

    @Override
    public MyList<Product> findAll() {
        return this.products;
    }

    @Override
    public Product findById(int id) {
        for (Product product : this.products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
       if (product == null) {
           return null;
       }
       this.products.add(product);
        return product;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}

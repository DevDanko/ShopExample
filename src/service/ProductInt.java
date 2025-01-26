package service;

import Utils.MyList;
import model.Product;

import java.util.List;

public interface ProductInt {
    MyList<Product> findAll();
    Product findById(int id);
    Product save(Product product);
    boolean delete(int id);
}

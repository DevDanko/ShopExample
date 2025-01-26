package repository;

import Utils.MyList;
import model.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author : Sergey Danilko
 * created : 26.01.2025
 **/


public interface ProductRepository {

    MyList<Product> findAll();
    Product findById(int id);
    Product save(Product product);
    boolean delete(int id);
}

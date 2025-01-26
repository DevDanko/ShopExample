package repository;

import model.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author : Sergey Danilko
 * created : 26.01.2025
 **/


public interface ProductRepository {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    void delete(Long id);
}

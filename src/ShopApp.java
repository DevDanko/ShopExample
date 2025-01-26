import Utils.MyList;
import model.Product;
import repository.InMemoryProductRepository;
import repository.ProductRepository;

/**
 * @author : Sergey Danilko
 * created : 26.01.2025
**/

public class ShopApp {
    public static void main(String[] args) {
        InMemoryProductRepository repo = new InMemoryProductRepository();
        Product product1 = new Product(1, "Bulochka", 13.45);
        Product product2 = new Product(22, "Kolbsa", 10.88);
        Product product3 = new Product(3, "Cola", 8.88);
        System.out.println(repo.findAll().size());
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        System.out.println(repo.findAll().size());
        for (Product p : repo.findAll()) {
            System.out.println(p);
        }
    }

}
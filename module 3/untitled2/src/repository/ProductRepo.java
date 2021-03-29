package repository;

import model.Product;

import java.util.List;

public interface ProductRepo {
    List<Product> findAll();
    List<Product> findByDate(String start , String end);
    void addProduct(Product product);
    void topSaleProduct(int number);
}

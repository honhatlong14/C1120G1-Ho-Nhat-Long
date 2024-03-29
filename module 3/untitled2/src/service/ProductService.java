package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    String addProduct(Product product);
    void topSaleProduct(int number);
    List<Product> findByDate(String start , String end);
}

package com.example.bean.service.impl;

import com.example.bean.model.Product;
import com.example.bean.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"Iphone X",1600));
        products.put(2, new Product(2,"Iphone XS",1500));
        products.put(3, new Product(3,"Iphone 12",5000));
        products.put(4, new Product(4,"SamSung Note 20",3000));
        products.put(5, new Product(5,"SamSung S20",1800));
        products.put(6, new Product(6,"SamSung S20 Plus",2500));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}

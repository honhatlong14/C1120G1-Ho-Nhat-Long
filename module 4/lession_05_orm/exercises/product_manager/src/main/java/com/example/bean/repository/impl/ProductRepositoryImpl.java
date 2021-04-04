package com.example.bean.reposiory.impl;

import com.example.bean.model.Product;
import com.example.bean.reposiory.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ProductRepositoryImpl implements ProductRepository {


    @PersistenceContext
    private EntityManager em;

    private static List<String> products;
    static {
        products.add("Iphone 1");
        products.add("Iphone 2");
        products.add("Iphone 3");
        products.add("Iphone 4");
    }

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = em.createQuery("select p from Product p",Product.class);
        return query.getResultList();
    }

    @Override
    public Product findById(int id) {
        TypedQuery<Product> query = em.createQuery("select p from Product p where  p.id=:id", Product.class);
        query.setParameter("id",id);
        try {
                return (Product) query.getResultList();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Product product) {
        if (product.getId() != null){
            em.merge(product);
        }else {
            em.persist(product);
        }
    }
    @Override
    public void remove(int id) {
        Product product = findById(id);
        if (product !=null){
            em.remove(product);
        }
    }
}

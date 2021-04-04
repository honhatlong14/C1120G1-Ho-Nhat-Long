package com.example.bean.repository.impl;

import com.example.bean.model.Product;
import com.example.bean.repository.ProductRepository;
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
            em.persist(product);
    }

    @Override
    public void update(Product product) {
        em.merge(product);
    }

    @Override
    public void remove(int id) {
        Product product = findById(id);
        if (product !=null){
            em.remove(product);
        }
    }
}

package model.repository;

import model.bean.customer.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);
}

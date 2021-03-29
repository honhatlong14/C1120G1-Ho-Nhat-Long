package model.repository;

import model.bean.customer.CustomerType;

public interface CustomerTypeRepository {
    CustomerType findById(int id);
}

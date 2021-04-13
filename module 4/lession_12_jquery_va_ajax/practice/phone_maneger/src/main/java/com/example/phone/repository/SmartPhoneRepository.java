package com.example.phone.repository;

import com.example.phone.entity.SmartPhone;
import org.springframework.data.repository.CrudRepository;

public interface SmartPhoneRepository extends CrudRepository<SmartPhone, Integer> {
}

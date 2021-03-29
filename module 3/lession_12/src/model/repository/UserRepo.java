package model.repository;

import model.bean.User;

import java.util.List;

public interface UserRepo {
    List<User> findAll();

    User findById(int id);

    void save(User user);

    void update(User user);

    void remove(int id);

    List<User> findByCountry(String country);
}

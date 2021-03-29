package model.service.impl;

import model.bean.User;
import model.repository.UserRepo;
import model.repository.repositoryImpl.UserRepoImpl;
import model.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepo userRepo = new UserRepoImpl();
    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void update(User user) {
        userRepo.update(user);
    }

    @Override
    public void remove(int id) {
        userRepo.remove(id);
    }


    @Override
    public List<User> findByCountry(String country) {
        return userRepo.findByCountry(country);
    }
}

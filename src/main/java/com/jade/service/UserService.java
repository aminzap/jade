package com.jade.service;

import com.jade.entity.User;

import java.util.List;

public interface UserService {
    public void addOrUpdateUser(User user);
    public List<User> findAll();
    public User findUserById(Integer id);
    public void deleteUserById(Integer id);
}

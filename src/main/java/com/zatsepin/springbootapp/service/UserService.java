package com.zatsepin.springbootapp.service;

import com.zatsepin.springbootapp.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void remove(User user);
    List<User> getUsers();
    User getUserById(long id);
    void updateUser(User user);
}

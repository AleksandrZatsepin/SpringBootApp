package com.zatsepin.springbootapp.dao;


import com.zatsepin.springbootapp.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void remove(User user);
    List<User> getUsers();
    void updateUser(User user);

    User getUser(long id);
}

package com.zatsepin.springbootapp.dao;

import com.zatsepin.springbootapp.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private EntityManager entityManage;

    @Override
    public void add(User user) {
        entityManage.persist(user);
    }

    @Override
    public void remove(User user) {
        entityManage.remove(entityManage.contains(user) ? user : entityManage.merge(user));
    }

    @Override
    public List<User> getUsers() {
        TypedQuery<User> query=entityManage.createQuery("from User", User.class);
        return query.getResultList();
    }

    @Override
    public void updateUser(User user) {
        entityManage.merge(user);
    }

    @Override
    public User getUser(long id) {
        return entityManage.find(User.class, id);
    }
}

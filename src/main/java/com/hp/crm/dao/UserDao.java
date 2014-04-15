package com.hp.crm.dao;

import com.hp.crm.model.User;

import java.util.List;

public interface UserDao {

    public List<User> findAllUsers();

    public User findUserById(long id);

    public void saveUser(User user);

    public void updateUser(User user);
    
    public void deleteUser(User user);

}

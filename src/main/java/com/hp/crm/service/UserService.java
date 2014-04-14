package com.hp.crm.service;

import com.hp.crm.model.User;

import java.util.List;

public interface UserService {

    public List<User> listAllUsers();

    public User getUserById(long id);

    public void addUser(User user);

    public void updateUser(User user);
}

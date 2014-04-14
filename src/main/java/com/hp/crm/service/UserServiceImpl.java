package com.hp.crm.service;

import com.hp.crm.dao.UserDaoImpl;
import com.hp.crm.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final Logger logger = Logger.getLogger(UserServiceImpl.class);

    @Autowired private UserDaoImpl userDao;

    @Override
    public List<User> listAllUsers() {
        return userDao.findAllUsers();
    }

    @Override
    public User getUserById(long id) {
        logger.info("getUserById() start");
        User user = userDao.findUserById(id);
        logger.info("getUserById() end");
        return user;
    }

    @Override
    public void addUser(User user) {
        logger.info("addUser() start");
        userDao.saveUser(user);
        logger.info("addUser() end");
    }

    @Override
    public void updateUser(User user) {
        logger.info("updateUser() start");
        userDao.updateUser(user);
        logger.info("updateUser() end");
    }

}

package com.hp.crm.dao;

import com.hp.crm.model.User;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final Logger logger = Logger.getLogger(UserDaoImpl.class);
    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> findAllUsers() {
        logger.info("findAllUsers start");
        List<User> users = sessionFactory.getCurrentSession().createQuery("from User").list();
        logger.info("findAllUsers end");
        return users;
    }

    @Override
    public User findUserById(long id) {
        logger.info("findUserById start");
        User user = (User) sessionFactory.getCurrentSession().get(User.class, id);
        logger.info("findUserById end");
        return user;
    }

    @Override
    public void saveUser(User user) {
        logger.info("saveUser start");
        sessionFactory.getCurrentSession().save(user);
        logger.info("saveUser method end");
    }

    @Override
    public void updateUser(User user) {
        logger.info("updateUser start");
        sessionFactory.getCurrentSession().update(user);
        logger.info("updateUser end");
    }

    @Override
    public void deleteUser(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }
}

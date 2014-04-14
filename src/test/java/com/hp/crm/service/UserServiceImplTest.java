package com.hp.crm.service;

import com.hp.crm.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-application-context.xml")
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testGetUserById() throws Exception {
        User u = userService.getUserById(1);
        Assert.assertEquals("Yao", u.getFirstName());
        Assert.assertEquals("Xiao", u.getLastName());
        Assert.assertEquals("yao.xiao@hp.com", u.getEmail());
    }
}

package com.niu.service.Impl;

import com.niu.dataobject.UserName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserNameImplTest {

    @Autowired
    private UserNameImpl userNameService;
    @Test
    @Transactional
    public void save() throws Exception {
        UserName userName = new UserName("fff","123456");
        UserName userName1 = new UserName("BBBBBB","123456");
        UserName userName2 = new UserName("CCCC","123456");
        UserName userName3 = new UserName("DDD","123456");
        UserName userName4 = new UserName("EEE","123456");

        userNameService.save(userName);
        userNameService.save(userName1);
        userNameService.save(userName2);
        userNameService.save(userName3);
        userNameService.save(userName4);
    }

}
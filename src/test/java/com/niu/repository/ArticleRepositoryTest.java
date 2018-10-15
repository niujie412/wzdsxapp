package com.niu.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleRepositoryTest {


    @Autowired
    private ArticleRepository repository;

    @Test
    public void findOneTest() {
        repository.findOne(1);
    }
}
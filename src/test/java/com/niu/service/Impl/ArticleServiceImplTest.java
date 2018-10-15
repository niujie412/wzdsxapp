package com.niu.service.Impl;

import com.niu.dataobject.Article;
import com.niu.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceImplTest {

    @Autowired
    private ArticleServiceImpl articleService;

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<Article> articlePage = articleService.findAll(pageRequest);
        System.out.println(articlePage);
        System.out.println(articlePage.getTotalPages());
    }

}
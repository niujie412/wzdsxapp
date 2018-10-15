package com.niu.service;

import com.niu.dataobject.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ArticleService {

    Article save(Article article);

    Page<Article> findAll(Pageable pageable);

    Article findOne(Integer id);
}

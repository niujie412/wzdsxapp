package com.niu.service.Impl;


import com.niu.dataobject.Article;
import com.niu.repository.ArticleRepository;
import com.niu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository repository;

    @Override
    public Article save(Article article) {
        return repository.save(article);
    }

    @Override
    public Page<Article> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }


    @Override
    public Article findOne(Integer id) {
        return repository.findOne(id);
    }
}

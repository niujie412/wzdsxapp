package com.niu.repository;

import com.niu.dataobject.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer>{
}

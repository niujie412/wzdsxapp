package com.niu.controller;

import com.niu.VO.ResponseVO;
import com.niu.dataobject.Article;
import com.niu.service.Impl.ArticleServiceImpl;
import com.niu.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/")
public class ArticleController {
    @Autowired
    private ArticleServiceImpl service;

    @GetMapping(value = "/getarticle/{id}")
    public ResponseVO getArticleById(@PathVariable("id") Integer id){
        return ResponseUtil.success(service.findOne(id));
    }

    @GetMapping(value = "/getarticles")
    public ResponseVO getArticles(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                  @RequestParam(value = "size",defaultValue = "10") Integer size){
        Sort sort = new Sort(Sort.Direction.ASC,"id");
        Pageable pageable = new PageRequest(page-1,size,sort);
        System.out.println(page);
//        service.findAll(pageable);
        return ResponseUtil.success(service.findAll(pageable));
    }

    @PostMapping(value = "/addarticle")
    public ResponseVO save(@Valid Article article, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            ResponseUtil.error(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseUtil.success(service.save(article));
    }

    @PostMapping(value = "/updatearticle")
    public ResponseVO update(@Valid Article article, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            ResponseUtil.error(-1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseUtil.success(service.save(article));
    }
//    @PostMapping(value = "/addarticle")
//    public ResponseVO createArticle(@RequestParam("author") String author,
//                                    @RequestParam("articleTitle") String articleTitle,
//                                    @RequestParam("imgUrl") String imgUrl,
//                                    @RequestParam("articles") String articles,
//                                    @RequestParam("readingQuantity") Integer readingQuantity,
//                                    @RequestParam("likeQuantity") Integer likeQuantity,
//                                    @RequestParam("subTitle") String subTitle){
//        Article article = new Article();
//        article.setAuthor(author);
//        article.setArticleTitle(articleTitle);
//        article.setSubTitle(subTitle);
//        article.setImgUrl(imgUrl);
//        article.setArticles(articles);
//        article.setReadingQuantity(readingQuantity);
//        article.setLikeQuantity(likeQuantity);
//        return ResponseUtil.success(service.save(article));
//    }
}


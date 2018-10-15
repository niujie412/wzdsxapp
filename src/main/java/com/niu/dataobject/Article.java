package com.niu.dataobject;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
public class Article {

    @Id
    @GeneratedValue
    private Integer id;

    //作者
    @NotEmpty
    private String author;

    //文章标题
    @NotEmpty
    private String articleTitle;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    //阅读量
    private Integer readingQuantity;

    //点赞量
    private Integer likeQuantity;

    @NotEmpty
    private String articles;

    private String subTitle;

    private String imgUrl;

    public Article(String author, String articleTitle, Date createTime, Date updateTime, Integer readingQuantity, Integer likeQuantity, String articles, String subTitle, String imgUrl) {
        this.author = author;
        this.articleTitle = articleTitle;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.readingQuantity = readingQuantity;
        this.likeQuantity = likeQuantity;
        this.articles = articles;
        this.subTitle = subTitle;
        this.imgUrl = imgUrl;
    }

    public Article() {
    }
}

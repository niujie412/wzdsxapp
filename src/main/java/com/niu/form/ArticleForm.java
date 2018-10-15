package com.niu.form;


import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class ArticleForm {

    @NotEmpty
    private String author;

    @NotEmpty
    private String articleTitle;

    @NotEmpty
    private String article;

    @NotEmpty
    private String imgUrl;

//    @NotEmpty
//    private String
}

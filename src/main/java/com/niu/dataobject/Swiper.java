package com.niu.dataobject;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.niu.enums.BannerEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
public class Swiper {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private String img;

    private String url;

    /** banner状态 0在线，1不在线*/
//    @JsonIgnore
    private Integer status = BannerEnum.BANNER_ONLINE.getCode();

}

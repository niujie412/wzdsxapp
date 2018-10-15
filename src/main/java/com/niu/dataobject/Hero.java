package com.niu.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/8.
 */
@Entity
@Data
@DynamicUpdate
public class Hero {

    @Id
    @GeneratedValue
    private Integer id;

    private String heroName;

    /**类型*/
    private String type;

    private String heroGold;

    private String heroCoupons;

    /**头像 **/
    private String heroPortrait;

    /** 英雄背景故事 */
    private String story;

    private Date createTime;

    private Date updateTime;

}

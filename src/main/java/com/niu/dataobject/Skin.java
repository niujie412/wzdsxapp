package com.niu.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/9/8.
 */
@Entity
@Data
public class Skin {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer heroId;

    private String skinName;

    private String skinPrice;

    private String skinProperty;
}

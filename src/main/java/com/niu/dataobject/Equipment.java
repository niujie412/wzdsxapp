package com.niu.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Equipment {

    @Id
    @GeneratedValue
    private Integer id;

    private String equipmentName;

    private String equipmentBaseProperty;

    private String equipmentOnlyProperty;

    private String equipmentImgUrl;

    private String equipmentPrice;

    private Integer type;
}

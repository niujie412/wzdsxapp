package com.niu.VO;

import lombok.Data;

/**
 * 返回查询英雄列表
 */
@Data
public class HeroListVO {

    private Integer heroId;

    private String heroName;

    private String heroPortrait;

    private String type;
}

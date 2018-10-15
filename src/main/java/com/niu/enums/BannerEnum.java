package com.niu.enums;

import lombok.Getter;

@Getter
public enum BannerEnum {

    BANNER_ONLINE(0,"在线"),

    BANNER_OFFLINE(1,"已下线"),

    ;

    private Integer code;

    private String msg;

    BannerEnum(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }
}

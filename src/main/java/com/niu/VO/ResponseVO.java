package com.niu.VO;

import lombok.Data;

/**
 * 返回体
 * @param <T>
 */
@Data
public class ResponseVO<T> {

    private Integer code;

    private String message;

    private T data;
}

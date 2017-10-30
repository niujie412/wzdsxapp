package com.niu.utils;

import com.niu.VO.ResponseVO;

/**
 * 返回体 1 成功
 */
public class ResponseUtil {

    public static ResponseVO success(Object object){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode(1);
        responseVO.setMessage("成功");
        responseVO.setData(object);
        return responseVO;
    }

    public static ResponseVO success(){
        return success(null);
    }

    public static ResponseVO error(Integer code,String message){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode(code);
        responseVO.setMessage(message);
        return responseVO;
    }
}

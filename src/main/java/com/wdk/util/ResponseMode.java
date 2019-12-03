package com.wdk.util;

/**
 * @Description:
 * @Author:wang_dk
 * @Date:2019/12/3 0003 21:38
 * @Version: v1.0
 **/
public class ResponseMode<T> {

    /**请求响应码*/
    private Integer code;

    /**请求响应描述*/
    private String msg;

    /**请求响应数据*/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

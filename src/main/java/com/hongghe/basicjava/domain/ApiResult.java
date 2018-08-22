package com.hongghe.basicjava.domain;

/**
 * 接口返回
 *
 * @author hongghe 09/08/2018
 */
public enum ApiResult {

    SUCCESS(1, "SUCCESS"),
    UNKNOWN(0, "UNKNOWN"),
    ERROR(-1, "ERROR");

    private Integer code;
    private String msg;

    ApiResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }
}

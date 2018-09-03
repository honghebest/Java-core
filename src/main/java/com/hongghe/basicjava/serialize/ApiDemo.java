package com.hongghe.basicjava.serialize;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hongghe 2018/9/3
 */
@Data
public class ApiDemo implements Serializable {
    private static final long serialVersionUID = 4145464377585899784L;

    public Integer code;
    public String msg;
}

package com.hongghe.basicjava.io.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author hongghe 2018/11/18
 */
@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class InputData {

    /**
     * 调用的类名
     */
    private final String className;

    /**
     * 调用的方法名
     */
    private final String methodName;

}

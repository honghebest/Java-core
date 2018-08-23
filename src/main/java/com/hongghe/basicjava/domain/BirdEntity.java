package com.hongghe.basicjava.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hongghe 2018/8/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderClassName = "Builder", toBuilder = true)
public class BirdEntity {
    private String clazz;
    private String name;
    private String high;
    private Integer weight;
}

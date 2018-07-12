package com.hongghe.basicjava.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User basic information.
 *
 * @author hongghe
 */
@Builder(builderClassName = "Builder", toBuilder = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long uid;
    private String name;
    private Integer age;
    private String address;
    private double salary;
}

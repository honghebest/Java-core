package com.hongghe.basicjava.json.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 教师
 *
 * @author hongghe 10/08/2018
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
    private String name;
    private Integer age;
    private String homeAddress;
    private String houseAddress;
    private String job;
}

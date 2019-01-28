package com.hongghe.basicjava.inherits.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: hongghe @date: 2019-01-28 16:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public String name;
    public int age;
}

package com.hongghe.basicjava.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderClassName = "Builder", toBuilder = true)
public class Student {
    private String name;
    private String address;
}

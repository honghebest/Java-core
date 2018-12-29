package com.hongghe.basicjava.oop.abstracts.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author hongghe 2018/8/23
 */
@Data
public class OperationSystem {
    public final String name;
    public final Date bornTime;
}

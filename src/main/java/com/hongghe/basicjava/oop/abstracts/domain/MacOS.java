package com.hongghe.basicjava.oop.abstracts.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author hongghe 2018/8/23
 */

public class MacOS  extends OperationSystem {
    public MacOS(String name, Date bornTime) {
        super(name, bornTime);
    }
}

package com.hongghe.basicjava.oop.abstracts.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author hongghe 2018/8/23
 */

public class LinuxOS extends OperationSystem {
    public LinuxOS(String name, Date bornTime) {
        super(name, bornTime);
    }
}

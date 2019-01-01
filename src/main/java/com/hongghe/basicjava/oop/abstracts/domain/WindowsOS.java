package com.hongghe.basicjava.oop.abstracts.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author hongghe 2018/8/23
 */

public class WindowsOS extends OperationSystem {
    public String message;

    public WindowsOS(String name, Date bornTime) {
        super(name, bornTime);
    }
}

package com.hongghe.basicjava.oop.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class Car {

    private static final Logger LOGGER = LoggerFactory.getLogger(Car.class);

    private CarEntity carEntity;

    public Car() {}

    public Car(CarEntity carEntity) {
        this.carEntity = carEntity;
    }

    public void run() {
        LOGGER.info("开动汽车。");
    }
}

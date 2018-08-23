package com.hongghe.basicjava.oop.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class AudiCar extends Car {

    private static final Logger LOGGER = LoggerFactory.getLogger(AudiCar.class);

    private AudiCarEntity audiCarEntity;

    public AudiCar() {}

    public AudiCar(AudiCarEntity audiCarEntity) {
        this.audiCarEntity = audiCarEntity;
    }

    @Override
    public void run() {
        LOGGER.info("This is Audi car is running.");
    }
}

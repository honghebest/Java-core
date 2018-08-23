package com.hongghe.basicjava.oop.domain;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class BMWCar extends Car {

    private static final Logger LOGGER = LoggerFactory.getLogger(BMWCar.class);

    private BMWCarEntity bmwCarEntity;

    public BMWCar() {}

    public BMWCar(BMWCarEntity bmwCarEntity) {
        Gson gson = new Gson();
        LOGGER.info("The BMW info = {}", gson.toJson(bmwCarEntity));
        this.bmwCarEntity = bmwCarEntity;
    }

    @Override
    public void run() {
        LOGGER.info("The BMW car is running.");
    }

    public static void main(String[] args) {
        BMWCarEntity bmwCar = new BMWCarEntity();
        bmwCar.setBmwCar("bmw");
        bmwCar.setModel("asd");
        Car car = new BMWCar(bmwCar);
        car.run();
    }
}

package com.hongghe.basicjava.clone;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/9/3
 */
public class CloneDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(CloneDemo.class);

    public static void main(String[] args) {
        Car car = new Car();
        car.setHeight(123.213);
        car.setName("car");
        car.setLength(1232.21);
        Car cloneCar = (Car) car.clone();
        cloneCar.setName("cloneName");

        System.out.println(car == cloneCar);
        Gson gson = new Gson();
        System.out.println(gson.toJson(car));
        System.out.println(gson.toJson(cloneCar));

        Car carDeep = new Car();
        carDeep.setName("DeepCar");
        BMWCar bmwCar = new BMWCar();
        bmwCar.setNo(123123);
        bmwCar.setCar(carDeep);
        BMWCar cloneBMWCar = (BMWCar) bmwCar.clone();
        System.out.println(gson.toJson(bmwCar));
        System.out.println(gson.toJson(cloneBMWCar));
        carDeep.setName("deepCarDemo");
        cloneBMWCar.setCar(carDeep);
        System.out.println(bmwCar.getCar() == cloneBMWCar.getCar());
        System.out.println(gson.toJson(cloneBMWCar));
        System.out.println(gson.toJson(bmwCar));
    }
}

package com.hongghe.basicjava.clone;

import lombok.Data;

/**
 * @author hongghe 2018/9/3
 */
@Data
public class BMWCar implements Cloneable {

    private Integer no;

    private Car car;

    @Override
    public Object clone() {
        BMWCar bmwCar = new BMWCar();
        try {
            //浅复制
            bmwCar = (BMWCar) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //深复制
        bmwCar.car = (Car) car.clone();
        return bmwCar;
    }
}

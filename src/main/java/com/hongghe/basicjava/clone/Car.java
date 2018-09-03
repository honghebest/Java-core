package com.hongghe.basicjava.clone;

import lombok.Data;

/**
 * @author hongghe 2018/9/3
 */
@Data
public class Car implements Cloneable {
    public String name;
    public Double length;
    public Double height;

    @Override
    public Object clone() {
        Car car = null;
        try {
            car = (Car) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }
}

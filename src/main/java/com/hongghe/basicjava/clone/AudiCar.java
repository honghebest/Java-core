package com.hongghe.basicjava.clone;

import lombok.Data;

/**
 * @author hongghe 2018/9/3
 */

@Data
public class AudiCar implements Cloneable {

    private String type;

    @Override
    public Object clone() {
        AudiCar car = null;
        try {
            car = (AudiCar) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return car;
    }
}

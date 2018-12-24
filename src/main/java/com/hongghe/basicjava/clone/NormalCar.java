package com.hongghe.basicjava.clone;

import lombok.Data;

/**
 * @author hongghe 2018/9/3
 */
@Data
public class NormalCar implements Cloneable {
    public String name;
    public Double length;
    public Double height;

    @Override
    public Object clone() {
        NormalCar normalCar = null;
        try {
            normalCar = (NormalCar) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return normalCar;
    }
}

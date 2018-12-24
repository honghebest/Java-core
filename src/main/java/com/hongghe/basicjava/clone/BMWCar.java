package com.hongghe.basicjava.clone;

import lombok.Data;

/**
 * @author hongghe 2018/9/3
 */
@Data
public class BMWCar implements Cloneable {

    private Integer no;

    private NormalCar normalCar;

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
        bmwCar.normalCar = (NormalCar) normalCar.clone();
        return bmwCar;
    }
}

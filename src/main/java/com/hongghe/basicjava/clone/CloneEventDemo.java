package com.hongghe.basicjava.clone;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import lombok.extern.slf4j.Slf4j;

/**
 * @author hongghe 2018/9/3
 */
@Slf4j
public class CloneEventDemo {

    public static void main(String[] args) {
        NormalCar normalCar = new NormalCar();
        normalCar.setHeight(123.213);
        normalCar.setName("normalCar");
        normalCar.setLength(1232.21);
        NormalCar cloneNormalCar = (NormalCar) normalCar.clone();
        cloneNormalCar.setName("cloneName");

        System.out.println(normalCar == cloneNormalCar);
        Gson gson = new Gson();
        System.out.println(gson.toJson(normalCar));
        System.out.println(gson.toJson(cloneNormalCar));

        NormalCar normalCarDeep = new NormalCar();
        normalCarDeep.setName("DeepCar");
        BMWCar bmwCar = new BMWCar();
        bmwCar.setNo(123123);
        bmwCar.setNormalCar(normalCarDeep);
        BMWCar cloneBMWCar = (BMWCar) bmwCar.clone();
        System.out.println(gson.toJson(bmwCar));
        System.out.println(gson.toJson(cloneBMWCar));
        normalCarDeep.setName("deepCarDemo");
        cloneBMWCar.setNormalCar(normalCarDeep);
        System.out.println(bmwCar.getNormalCar() == cloneBMWCar.getNormalCar());
        System.out.println(gson.toJson(cloneBMWCar));
        System.out.println(gson.toJson(bmwCar));

        String elementJson = "{\"accountId\":\"3939823\",\"userActionSetId\":\"1106562902\",\"clientId\":\"1106562278\",\"clientSecret\":\"p4r99Su6B4Zx2iIJ\",\"redirectUri\":\"https://aso.xiaoying.com/oauth/index\"}";
        JsonElement jsonElement = gson.toJsonTree(elementJson);
        log.info("jsonElement = = {}", jsonElement);
        log.info("jsonElement = = {}", gson.toJson(jsonElement));
    }
}

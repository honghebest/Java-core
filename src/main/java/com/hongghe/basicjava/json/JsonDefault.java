package com.hongghe.basicjava.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * json转化的工具
 *
 * @author hongghe 31/07/2018
 */
public class JsonDefault {

    public JsonDefault() {}

    public JsonElement JsonDefault(Object object) {
        if (object != null) {
            Gson gson = new Gson();
            return gson.toJsonTree(object);
        }
        return null;
    }
}

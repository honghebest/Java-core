package com.hongghe.basicjava.rawtype;

import com.google.gson.Gson;
import com.hongghe.basicjava.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class MethodRawType<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodRawType.class);

    public MethodRawType<T> getMethodType() {
        LOGGER.info("The raw type of method.");
        return new MethodRawType<>();
    }

    public <E> String getMethodValue(E e) {
        Gson gson = new Gson();
        LOGGER.info("The object is = {}", gson.toJson(e));
        LOGGER.info("The raw type: " + e.toString());
        return e.toString();
    }

    public static void main(String[] args) {
        MethodRawType methodRawType = new MethodRawType();
        Person person = new Person();
        person.setAge(12);
        person.setName("Henry");
        methodRawType.getMethodValue("asd");
    }
}

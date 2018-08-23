package com.hongghe.basicjava.rawtype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class ClazzRawType<E, V> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClazzRawType.class);

    public E element;
    public V value;

    public ClazzRawType(E element, V value) {
        this.element = element;
        this.value = value;
    }

    public ClazzRawType(E element) {
        this.element = element;
    }

    ClazzRawType() {}

    public void setElement(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public static void main(String[] args) {
        ClazzRawType<String, Object> clazzRawType = new ClazzRawType<>("element value.", "value value.");
        LOGGER.info("The clazz raw type is " + clazzRawType.value);
        ClazzRawType<Integer, Object> integerClazzRawType = new ClazzRawType<>(1);
        integerClazzRawType.setElement(2);
        LOGGER.info("The clazz raw type is " + integerClazzRawType.element);
    }
}

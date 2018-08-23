package com.hongghe.basicjava.rawtype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class ClazzRawType<E> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClazzRawType.class);

    public E element;

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
        ClazzRawType<String> clazzRawType = new ClazzRawType<>("da");
        ClazzRawType<Integer> integerClazzRawType = new ClazzRawType<>();
        integerClazzRawType.element = 123;
        LOGGER.info("The clazz raw type is " + integerClazzRawType.element);
    }
}

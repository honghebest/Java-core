package com.hongghe.basicjava.serialize;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * @author hongghe 2018/8/24
 */
public class SerializeTest implements Serializable {

    private static final long serialVersionUID = 8939011289025270308L;

    private static final Logger LOGGER = LoggerFactory.getLogger(SerializeTest.class);

    public void main() {
        LOGGER.info("序列化的实现。");
    }
}

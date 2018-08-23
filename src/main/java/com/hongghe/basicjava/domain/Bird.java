package com.hongghe.basicjava.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public abstract class Bird {

    private static final Logger LOGGER = LoggerFactory.getLogger(Bird.class);

    private BirdEntity birdEntity;

    public Bird(BirdEntity birdEntity) {
        this.birdEntity = birdEntity;
    }

    public void init() {
        LOGGER.info("[Bird][init]Init a bird.");
    }
}

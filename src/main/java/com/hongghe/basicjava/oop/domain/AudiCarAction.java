package com.hongghe.basicjava.oop.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/23
 */
public class AudiCarAction implements CarAction {

    private static final Logger LOGGER = LoggerFactory.getLogger(AudiCarAction.class);

    @Override
    public void init() {

    }

    @Override
    public void run() {

    }

    @Override
    public Direction turnDirection() {
        return null;
    }

    @Override
    public void stop() {

    }
}

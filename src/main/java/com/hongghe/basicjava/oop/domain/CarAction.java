package com.hongghe.basicjava.oop.domain;

/**
 * @author hongghe 2018/8/23
 */
public interface CarAction {

    /**
     * 初始化car的类型
     */
    void init();

    /**
     * 开车
     */
    void run();

    /**
     * 转向
     *
     * @return 方向
     */
    Direction turnDirection();

    void stop();
}

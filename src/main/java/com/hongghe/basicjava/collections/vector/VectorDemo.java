package com.hongghe.basicjava.collections.vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Vector;

/**Vector 也是实现于 List 接口，底层数据结构和 ArrayList 类似,
 * 也是一个动态数组存放数据。不过是在 add() 方法的时候使用 synchronized
 * 进行同步写数据，但是开销较大，所以 Vector 是一个同步容器并不是一个并发容器。
 *
 * @author hongghe 2018/8/25
 */
public class VectorDemo<E> {

    private static final Logger LOGGER = LoggerFactory.getLogger(VectorDemo.class);

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("name");
        vector.add(1, "name");
        vector.size();
    }
}

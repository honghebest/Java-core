package com.hongghe.basicjava.properties;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 获取配置中的信息
 *
 * @author hongghe 06/08/2018
 */
public class ReadProperties {

    /**
     * 直接读取
     *
     * @param pathName
     * @return
     */
    public Set<Map.Entry<Object, Object>> loandPropertyFile(String pathName) {
        Set<Map.Entry<Object, Object>> set = new HashSet<>();
        try {
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(pathName);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            Properties properties = new Properties();
            properties.load(inputStreamReader);
            set = properties.entrySet();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return set;
    }
}

package com.hongghe.basicjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author hongghe
 */
@SpringBootApplication
@EnableScheduling
public class BasicJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicJavaApplication.class, args);
    }
}

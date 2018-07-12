package com.hongghe.basicjava.thread;

import com.google.gson.Gson;
import com.hongghe.basicjava.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * The single thread of main.
 *
 * @author hongghe 07/2018
 */
@Service
public class SingleThread {

    private static final Logger logger = LoggerFactory.getLogger(SingleThread.class);

    public void singleThread() {
        User user = User.builder()
                .address("")
                .age(12)
                .salary(2.2)
                .name("")
                .build();
        Gson gson = new Gson();
        logger.info("The user={}", gson.toJson(user));
    }
}

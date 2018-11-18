package com.hongghe.basicjava.thread;

import com.google.gson.Gson;
import com.hongghe.basicjava.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * The single thread of main.
 *
 * @author hongghe 07/2018
 */
@Service
@Slf4j
public class SingleThread {

    public void singleThread() {
        User user = User.builder()
                .address("")
                .age(12)
                .salary(2.2)
                .name("")
                .build();
        Gson gson = new Gson();
        log.info("The user={}", gson.toJson(user));
    }

    public static void main(String[] args) {
        SingleThread singleThread = new SingleThread();
        singleThread.singleThread();
    }
}

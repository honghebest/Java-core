package com.hongghe.basicjava.future;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

/**
 * @author: hongghe @date: 2019-01-22 11:30
 */
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class RepayTask implements Callable<Long> {

    private String repayAmount;

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Long call() throws Exception {
        log.info("call back and handle task.");
        return null;
    }
}

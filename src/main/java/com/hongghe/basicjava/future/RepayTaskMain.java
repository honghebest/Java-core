package com.hongghe.basicjava.future;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author: hongghe @date: 2019-01-22 11:33
 */
public class RepayTaskMain {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        List<RepayTask> taskList = new ArrayList<RepayTask>();
        RepayTask task = new RepayTask("12");
        taskList.add(task);
        List<Future<Long>> resultList= null;
        try {
            //执行全部的线程
            resultList = executor.invokeAll(taskList);
            if(CollectionUtils.isNotEmpty(resultList)){
                for (int i=0; i<resultList.size(); i++){
                    Future<Long> future=resultList.get(i);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

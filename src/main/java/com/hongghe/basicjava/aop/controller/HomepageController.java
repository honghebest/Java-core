package com.hongghe.basicjava.aop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class HomepageController {

    private static final Logger logger = LoggerFactory.getLogger(HomepageController.class);

    @RequestMapping("hi")
    public String Hi() {
        return "hi, world!";
    }
}

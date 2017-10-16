package com.pefi.boilerplate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Value("${app.name}")
    private String name;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getTestString() {
        logger.info("Testing logging");
        return "<h1>Welcome to " + name + "</h1>";
    }

}

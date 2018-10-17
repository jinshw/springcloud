package com.jinshw.controller;

import com.jinshw.service.SchedualEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    SchedualEurekaClient schedualEurekaClient;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getHello(@RequestParam String name){

        return schedualEurekaClient.getHello(name);
    }
}

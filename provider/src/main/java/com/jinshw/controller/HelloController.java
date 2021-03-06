package com.jinshw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello(String name) {
        ServiceInstance instance = discoveryClient.getInstances("eureka-client").get(0);
        //打印服务的服务id
        logger.info("*********" + instance.getServiceId());
        return "hello,this is hello-service,your name is "+name;
    }
}

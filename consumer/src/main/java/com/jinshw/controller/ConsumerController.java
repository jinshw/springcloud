package com.jinshw.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    //这里注入的restTemplate就是在com.sam.ConsumerApp中通过@Bean配置的实例
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloError")
    public String helloConsumer(@RequestParam String name) {
        //调用hello-service服务，注意这里用的是服务名，而不是具体的ip+port
        restTemplate.getForObject("http://eureka-client/hello", String.class);
        return "hello consumer finish !!!  your name is "+name;
    }

    public String helloError(String name){
        return "hi,"+name+",sorry.error!";
    }
}

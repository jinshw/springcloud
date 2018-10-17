package com.jinshw.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = SchedualEurekaHystric.class)
public interface SchedualEurekaClient {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String getHello(@RequestParam(value = "name") String name);
}

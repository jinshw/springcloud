package com.jinshw.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualEurekaHystric implements SchedualEurekaClient {
    @Override
    public String getHello(String name) {
        return "sorry "+name;
    }
}

package com.nacos.consumer.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "nacos-provider")
public interface RemoteClient {

    @RequestMapping("/helloNacos")
    String helloNacos();

}

package com.springcloud.feign.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "discovery2")
public interface FeignInterface2 {

    @GetMapping("/queryPort")
    String sayPort2();

    @GetMapping("/sayHello")
    String sayHello();
}

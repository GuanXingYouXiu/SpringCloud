package com.springcloud.feign.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "discovery")
public interface FeignInterface {

    @RequestMapping(value = "queryPort", method = RequestMethod.GET)
    String sayPort();

    @GetMapping("/sayNice")
    String sayNice();

}

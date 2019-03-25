package com.springcloud.feign.feignController;

import com.springcloud.feign.feignService.FeignInterface;
import com.springcloud.feign.feignService.FeignInterface2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    public FeignInterface feignInterface;

    @Autowired
    private FeignInterface2 feignInterface2;

    @GetMapping("/queryDiscovery")
    public String queryPort1() {
        return feignInterface.sayPort() + feignInterface.sayNice();
    }

    @GetMapping("/queryDiscovery2")
    public String queryPort2() {
        return feignInterface2.sayPort2() + feignInterface2.sayHello();
    }
}

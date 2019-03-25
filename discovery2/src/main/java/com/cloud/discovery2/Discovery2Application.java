package com.cloud.discovery2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Discovery2Application {

    public static void main(String[] args) {
        SpringApplication.run(Discovery2Application.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("queryPort")
    public String queryPort() {
        return "Port:" + port;
    }

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello!";
    }
}

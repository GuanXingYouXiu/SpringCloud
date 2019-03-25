package com.springcloud.discovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class DiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/queryPort")
    public String queryPort() {
        return "Port:" + port;
    }

    @RequestMapping("/sayNice")
    public String sayNice() {
        return "Nice!";
    }
}

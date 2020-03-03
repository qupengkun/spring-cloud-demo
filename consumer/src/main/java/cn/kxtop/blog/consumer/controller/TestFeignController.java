package cn.kxtop.blog.consumer.controller;

import cn.kxtop.blog.consumer.client.ProviderClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/feign")
public class TestFeignController {


    @Autowired
    private ProviderClient providerClient;


    @GetMapping
    public String get() {
        log.info("consumer feign get action");
        return providerClient.get();
    }

    @PostMapping
    public String post() {
        log.info("consumer feign post action");
        return providerClient.post();
    }

}

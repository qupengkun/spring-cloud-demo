package cn.kxtop.blog.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test-feign")
public class TestFeignController {

    @GetMapping
    public String get() {
        log.info("provider feign get action");
        return "test feign get";
    }
    @PostMapping
    public String post() {
        log.info("provider feign post action");
        return "test feign post";
    }

}

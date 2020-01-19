package cn.kxtop.blog.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-gateway")
public class TestGatewayController {

    @GetMapping
    public String testGateway() {
        return "Hi！ 我是Consumer服务中的TestGatewayController.";
    }


}

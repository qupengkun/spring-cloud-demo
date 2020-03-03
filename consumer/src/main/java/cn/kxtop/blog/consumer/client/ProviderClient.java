package cn.kxtop.blog.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "kxtop-provider", path = "/api/test-feign")
public interface ProviderClient {

    @GetMapping("/")
    String get();

    @PostMapping("/")
    String post();

}

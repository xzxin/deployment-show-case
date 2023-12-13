package com.example.module2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

// addition-service
@RestController
@SpringBootApplication
public class AdditionServiceApplication {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${app.remote}")
    private String remoteAddress;

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        Integer multiplicationResult = restTemplate.getForObject(remoteAddress + "/multiply?a={a}&b={b}", Integer.class, a, b);
        int calcRes = a + b + multiplicationResult;
        return "计算结果：" + calcRes + "\n";
    }

    public static void main(String[] args) {
        SpringApplication.run(AdditionServiceApplication.class, args);
    }
}

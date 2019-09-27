package com.example.web;

import com.example.common.common;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = {"com.example"})
public class WebApplication {

    @RequestMapping("web")
    public String web(){
        return common.getString();
    }


    public static void main(String[] args) {
        common common = new common();
        SpringApplication.run(WebApplication.class, args);
    }

}

package com.test;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.test.dubbo")
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}

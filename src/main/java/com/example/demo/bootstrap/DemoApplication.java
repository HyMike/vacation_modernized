package com.example.demo.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo")
public class DemoApplication {

        public static void main(String[] args) {
            SpringApplication.run(DemoApplication.class, args);

    }
}

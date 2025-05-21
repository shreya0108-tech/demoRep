package com.proj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
    }
    public static int sum(int a, int b) {
        return a * b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}

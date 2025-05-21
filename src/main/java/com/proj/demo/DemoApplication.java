package com.proj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        System.out.println(sum(2,3));

        System.out.println(prod(2,3,5));

        System.out.println(sumwith4(2,3,1,2));
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int prod(int a, int b, int c) {
        return a * b * c;
    }

    public static int sumwith4(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

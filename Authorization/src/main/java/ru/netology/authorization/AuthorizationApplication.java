package ru.netology.authorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AuthorizationApplication {
    public void addArgumentResolvers(List<UserHandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new UserHandlerMethodArgumentResolver());
    }

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationApplication.class, args);
    }

}

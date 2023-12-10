package com.jade.jade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.jade")
@Configuration
@ComponentScan("com.jade")
@EntityScan("com.jade")
@SpringBootApplication
public class JadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JadeApplication.class, args);
    }

}

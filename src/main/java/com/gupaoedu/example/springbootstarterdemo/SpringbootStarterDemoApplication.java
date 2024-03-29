package com.gupaoedu.example.springbootstarterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class
})
//@SpringBootApplication
public class SpringbootStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarterDemoApplication.class, args);
    }

}

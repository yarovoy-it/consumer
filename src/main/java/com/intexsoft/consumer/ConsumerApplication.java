package com.intexsoft.consumer;

import com.intexsoft.consumer.config.ConsumerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConsumerConfig.class)
public class ConsumerApplication {
    /**
     * Main method in application.
     *
     * @param args system arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}

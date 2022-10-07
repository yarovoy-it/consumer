package com.intexsoft.consumer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for consumer service
 */
@Configuration
@ConfigurationProperties(prefix = "consumer")
@EnableConfigurationProperties(ConsumerConfig.class)
public class ConsumerConfig {
    private int averageTimePeriod;

    public int getAverageTimePeriod() {
        return averageTimePeriod;
    }

    public void setAverageTimePeriod(int averageTimePeriod) {
        this.averageTimePeriod = averageTimePeriod;
    }
}
